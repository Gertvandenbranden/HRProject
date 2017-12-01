package be.vdab.training.domains;


import be.vdab.training.enums.Department;
import be.vdab.training.enums.Gender;
import be.vdab.training.enums.Transport;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

abstract class Worker extends BaseDomain {

    private String surName;
    private String middleName;
    private String name;
    private String fullName;
    private static Gender gender;
    private static Department department;
    private LocalDate birthDate;
    private LocalDate entryDate;
    private Transport[] transport;
    private String project;
    private String nationality;
    private String country;
    private String socialSecurityNumber;
    private String fullNameSocialSecurityNumber;


//  ● Voornaam
// ● Middle​ ​-​ ​name​ ​(vaak​ ​gebruikt​ ​in​ ​US)
    // ● familienaam
    // ● Maak​ ​ook​ ​een​ ​methode​ ​getFullName​ ​die​ ​de​ ​naam​ ​als​ ​geheel​ ​teruggeeft.
// Implementeer​ ​die​ ​op​ ​minstens​ ​2​ ​verschillende​ ​manieren​ ​(overloading)​ ​en​
// ​één implementatie​ ​maakt​ ​gebruikt​ ​van​ ​de​ ​variabele-aantal-argumenten​ ​syntax.


    public String getFirstName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFullName() {
        if (fullName == null) {
            if (this.getMiddleName() != null) {
                fullName = this.getFirstName() + " " + this.getMiddleName() + " " + this.getSurName();
            } else {
                fullName = this.getFirstName() + " " + this.getSurName();
            }
        }
        return fullName;
    }

    public String getFullNameSocialSecurityNumber(String fullName, String socialSecurityNumber) {
        return fullName + socialSecurityNumber;
    }


    //equals test op dubbele voornamen voor de set (lijst ) wordt opgevuld

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (!getFullName().equals(worker.getFullName())) return false;
        return getSocialSecurityNumber().equals(worker.getSocialSecurityNumber());
    }

    @Override
    public int hashCode() {
        int result = getFullName().hashCode();
        result = 31 * result + getSocialSecurityNumber().hashCode();
        return result;
    }


    // ● Geslacht​ ​:​ ​denk​ ​na​ ​hoe​ ​je​ ​mogelijke​ ​waardes​ ​beperkt

    public static Gender getGender() {
        return gender;
    }

    public static void setGender(Gender gender) {
        Worker.gender = gender;
    }

    // ● TransportType​ ​:​ ​een​ ​employee​ ​kan​ ​één​ ​of​ ​meerdere​ ​transport-types gebruiken.
// ​ ​We​ ​beperken​ ​dat​ ​momenteel​ ​tot​ ​3.​ ​Voorzie​ ​de​ ​meest​ ​gekende transport​ ​types.


    public Transport[] getTransport() {
        return transport;
    }

    public void setTransport(Transport transport1) {
        Transport[] transport = {transport1};
        this.transport = transport;
    }

    public void setTransport(Transport transport1, Transport transport2) {
        Transport[] transport = {transport1, transport2};
        this.transport = transport;
    }

    public void setTransport(Transport transport1, Transport transport2, Transport transport3) {
        Transport[] transport = {transport1, transport2, transport3};
        this.transport = transport;
    }


// ● Nationaliteit​ ​:​ ​denk​ ​na​ ​hoe​ ​je​ ​mogelijke​ ​waardes​ ​beperkt.​ ​We​ ​willen​ ​niet​
// ​enkel nationaliteit​ ​(Belg,​ ​Nederlander​ ​…)​ ​ondersteunen​ ​maar​ ​ook​ ​land​ ​
// (België​ ​…). Bovendien​ ​moet​ ​er​ ​een​ ​index​ ​worden​ ​voorzien​ ​zodat​ ​het​ ​meest​ ​
// logische​ ​land (België)​ ​bvb​ ​eerst​ ​in​ ​een​ ​dropdown​ ​kan​ ​worden​ ​getoond.


    public String getNationality() {
        return nationality;
    }


// ● Geboortedatum​ ​-​ ​enkel​ ​datum​ ​is​ ​voldoende,​ ​tijd​ ​hebben​ ​we​ ​niet​ ​nodig.
// Geboortedatum​ ​moet​ ​minstens​ ​18​ ​jaar​ ​in​ ​het​ ​verleden​ ​liggen.​ ​Schrijf​ ​de
//    validatie​ ​als​ ​afzonderlijke​ ​methode​ ​en​ ​denk​ ​na​ ​wat​ ​deze​ ​methode​ ​gaat
// teruggeven.​ ​Eventueel​ ​kan​ ​je​ ​zelfs​ ​een​ ​Utility​ ​klasse​ ​ontwerpen.​ ​Voor​ ​de
// datum-velden​ ​gebruiken​ ​we​ ​java.util.Date.​ ​Zie​ ​cursus​ ​op​ ​blz​ ​221​ ​om​ ​een
// Instant​ ​naar​ ​een​ ​Date​ ​te​ ​converteren.

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


// ● Aanwervingsdatum​ ​:​ ​datum​ ​moet​ ​na​ ​geboortedatum​ ​liggen​ ​en​ ​kan​ ​niet​ ​meer dan​
// ​2​ ​maand​ ​in​ ​de​ ​toekomst​ ​liggen


    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }


// ● Voorzie​ ​ook​ ​een​ ​methode​ ​die​ ​de​ ​anciënniteit​ ​berekent​ ​(in​ ​dagen).

    public void calculateDaysInService() {

        if (entryDate.isAfter(LocalDate.now())) {
            System.out.println("Dagen in dienst: " + 0);
        } else {
            System.out.println("Dagen in dienst: " +
                    ChronoUnit.DAYS.between(getEntryDate(), LocalDate.now()));
        }
    }


// ● Adres​ ​:​ ​ondersteun​ ​de​ ​mogelijkheid​ ​om​ ​straat,​ ​huisnr,​ ​gemeente​ ​te
// ondersteunen.​ ​In​ ​principe​ ​is​ ​het​ ​niet​ ​nodig​ ​adres​ ​als​ ​afzonderlijk​ ​object​ ​te
// ontwerpen​ ​maar​ ​het​ ​mag​ ​(zie​ ​extra’s)

//    private class Address extends BaseDomain{
//        String streetName;
//        String addressNumber;
//        String zipCode;
//        String city;


// ● Rijksregisternummer​ ​:​ ​voorzie​ ​een​ ​controle​ ​(lengte,​ ​structuur,
// geboorte-datum,​ ​check-digit)​ ​:​ ​zie https://nl.wikipedia.org/wiki/Rijks-
// registernummer


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


// ● Heeft-rijbewijs​ ​:​ ​denk​ ​na​ ​welke​ ​type​ ​je​ ​zal​ ​gebruiken
// ● Rijbewijs-type​ ​:​ ​denk​ ​na​ ​hoe​ ​je​ ​mogelijke​ ​waarde​ ​beperkt.​ ​Denk​ ​ook​ ​na​
// ​over de​ ​2​ ​properties​ ​Heeft-rijbewijs​ ​en​ ​Rijbewijs-type.

    //enum DriversLicence


// ● Een​ ​numerieke​ ​identifier​ ​die​ ​uniek​ ​is.​ ​Die​ ​wordt​ ​echter​ ​gehaald​ ​uit​ ​een
// basis-klasse​ ​klasse​ ​met​ ​de​ ​naam​​ ​BaseDomain​.


// ● Een​ ​departement.​ ​Een​ ​departement​ ​is​ ​een​ ​afzonderlijke​ ​klasse​ ​met​ ​als
// properties​ ​een​ ​identifier,​ ​een​ ​naam​ ​en​ ​een​ ​omschrijving.

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

// ● Projecten​ ​:​ ​iedereen​ ​werkt​ ​aan​ ​1​ ​tot​ ​N​ ​projecten.​ ​Een​ ​project​ ​is​ ​een
// afzonderlijke​ ​klasse​ ​met​ ​identifier,​ ​naam​ ​en​ ​omschrijving.​ ​Hint,​ ​normaal
// gebruiken​ ​we​ ​hier​ ​een​ ​List​ ​maar​ ​Collections​ ​framework​ ​komt​ ​vrij​ ​laat​ ​in​ ​de
// cursus​ ​aan​ ​bod.​ ​We​ ​ondersteunen​ ​dit​ ​dus​ ​door​ ​een​ ​array​ ​die​ ​maximaal​ ​5
// projecten​ ​ondersteunt.

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }


// ● Je​ ​kan​ ​dan​ ​ook​ ​een​ ​abstracte​ ​mutator​ ​-​ ​methode​ ​definiëren.​ ​Voor​ ​worker​
// ​is die​ ​abstract​ ​maar​ ​per​ ​overervende​ ​klasse​ ​gaat​ ​de​ ​mutator​ ​method​ ​een
// andere​ ​validatie​ ​bewerkstelligen.


// ● Voorzie​ ​ook​ ​een​ ​abstracte​ ​method​ ​​calculateTotalIncentiveCost. Deze​ ​methode​
// ​berekent​ ​de​ ​totale​ ​incentive​ ​cost​ ​op​ ​basis van​ ​de​ ​remuneraties.​ ​Zorg​ ​ervoor​
// ​dat​ ​dit​ ​bedrag​ ​met​ ​5​ ​% wordt​ ​verhoogd​ ​voor​ ​een​ ​manager​ ​en​ ​met​ ​10​ ​%​ ​voor​ ​een
// director.


// ● Optioneel​ ​:​ ​Gebruik​ ​voor​ ​projecten​ ​en​ ​remuneraties​ ​lazy-field-
// initialisation​ ​in the​ ​getter​ ​method.​ ​Tip​ ​:​ ​met​ ​lazy-field-initialisation​
// ​initialiseren​ ​we​ ​pas​ ​de variabele​ ​op​ ​moment​ ​dat​ ​die​ ​via​ ​de​ ​getter​ ​methode​
// ​wordt​ ​benaderd​ ​en wanneer​ ​hij​ ​niet​ ​geïnitialiseerd​ ​was.


// validation
//test bij validatie worker-object controle of arraylist leeg is

    public List<String> validateWorkerListOfExceptions() {
        List<String> errorMessages = new ArrayList<>();

        if (this.getFirstName() == null) {
            errorMessages.add("Please enter a firstname! ");
        }

        if (this.getSurName() == null) {
            errorMessages.add("Please enter a correct familyname! ");
        }

        if (this.getBirthDate() == null) {
            errorMessages.add("Please enter a correct birth date! ");
        }

        if (getEntryDate() == null
                || (getEntryDate().isAfter(LocalDate.now().plusMonths(2).plusDays(1)))
                || (getEntryDate().isBefore(LocalDate.from(getBirthDate().plusYears(18).minusDays(1))))) {
            errorMessages.add("The entrydate is either too farr in the future of the worker is not yet 18 years old!");
        }

        if (errorMessages.size() > 0 ) {
            return errorMessages;
        }

        String socialSecurity;
        String socialSecurityCheck;

        //controle geboortedatum met rijksregisternummer
        socialSecurity = getBirthDate().toString();
        socialSecurityCheck = socialSecurity.substring(2, 4) + socialSecurity.substring(5, 7) + socialSecurity.substring(8, 10);


        if (getBirthDate() == null) {
            errorMessages.add("The birthday cannot be empty! ");
        }


        if (socialSecurityCheck.equals(getSocialSecurityNumber().substring(0, 6))) {
        } else {
            errorMessages.add("The birthday does not correspond with the social security number! ");
        }

        //controle controlegetal rijksregisternummer
        int modolo;
        int controlDigit;
        int controle;

        modolo = 97 - (Integer.parseInt(getSocialSecurityNumber().substring(0, 9))) % 97;
        controlDigit = Integer.parseInt(getSocialSecurityNumber().substring(9, 11));
        controle = modolo - controlDigit;

        if (modolo - controlDigit != 0) {
            errorMessages.add("This social security number is incorrect! ");
        }

        //controle man/vrouw - man is oneven
        int testGender;

        socialSecurityCheck = getSocialSecurityNumber().substring(6, 9);
        testGender = Integer.parseInt(socialSecurityCheck) % 1;
        System.out.println(Integer.parseInt(socialSecurityCheck) % 2);
        if (testGender == 0 && getGender()==Gender.FEMALE) {
            errorMessages.add("The gender does not correspond with this social security number! ");
        }

        return errorMessages;
    }


    // uitwerken voor arraylist
//        public boolean validSocialSecurityNumber () {
//
//            String socialSecurity;
//            String socialSecurityCheck;
//            boolean test1 = false, test2 = false, test3 = false; //3 testvariablen

    //controle geboortedatum met rijksregisternummer
//            socialSecurity = getBirthDate().toString();
//            socialSecurityCheck = socialSecurity.substring(2, 4) + socialSecurity.substring(5, 7) + socialSecurity.substring(8, 10);
//
//            if (socialSecurityCheck.equals(getSocialSecurityNumber().substring(0, 6))) {
//                test1 = true;
//            } else {
//                test1 = false;
//            }

    //controle controlegetal rijksregisternummer
//            int modolo;
//            int controlDigit;
//            int controle;
//
//            modolo = 97 - (Integer.parseInt(getSocialSecurityNumber().substring(0, 9))) % 97;
//            controlDigit = Integer.parseInt(getSocialSecurityNumber().substring(9, 11));
//            controle = modolo - controlDigit;
//
//            if (modolo - controlDigit == 0) {
//                test2 = true;
//            } else {
//                test2 = false;
//            }
//
//            //controle man/vrouw - man is oneven
//            int man;
//
//            socialSecurityCheck = getSocialSecurityNumber().substring(6, 9);
//            man = Integer.parseInt(socialSecurityCheck) % 1;
//            System.out.println(Integer.parseInt(socialSecurityCheck) % 2);
//            if (man == 0 && getGender() == Gender.MALE) {
//                test3 = true;
//            } else {
//                test3 = false;
//            }

    //nakijken of de drie testen true zijn

//            return test1 && test2 && test3;
//        }
}



