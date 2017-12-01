package be.vdab.training.domains;

public class Country extends Worker{


    String[][] Country = {{"Belgium","The_Netherlands","France","Germany","Luxemburg"},
        {"1","Belgian","Dutch","French","German"},
        {"2","Dutchman", "Dutch"},
        {"3","Letseburg","Letseburg","German","French"},
        {"5","Frenchman","French"},
        {"4","German","German"}};

    public void setCountry(String[][] country) {
        Country = country;
    }

    public String[][] getCountry() {
        return Country;
    }
}
