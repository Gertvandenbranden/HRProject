
package be.vdab.training.domains;

import be.vdab.training.enums.Transport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static be.vdab.training.enums.Gender.MALE;



public class Tester{
    public static void main(String[] args){


        Employee employee=new Employee();
//        employee.setGender(MALE);
//        employee.setBirthDate(1976,11,26);
//        employee.setEntryDate(2017,10,01);
        employee.setBirthDate(LocalDate.of(1976,11,26));
        employee.setEntryDate(LocalDate.of(2017,10,01));

        employee.setSocialSecurityNumber("76112652775");
        employee.setTransport(Transport.CAR,Transport.BIKE,Transport.MOTORCYCLE);
//        System.out.println(employee.getBirthDate());
        System.out.println("Geboortedatum is "+employee.getBirthDate());
        System.out.println(employee.getGender());
      //  System.out.println("Aanwerving is "+ employee.validEntryDate());
        employee.calculateDaysInService();
//        Validator.validSocialSecurityNumber();
   //     System.out.println("De controle op het rijksregisternummer is "+employee.validSocialSecurityNumber());
  //      employee.setCountry("Belgium");
    //    System.out.println("De controle op de geboortedatum is "+employee.validBirthday());

    //Controle op dubbele invoer via equals en hashtag in Worker
    Employee employee1=new Employee();
    Employee employee2=new Employee();
    Employee employee3=new Employee();
    Employee employee4=new Employee();
    Employee employee5=new Employee();

        employee1.setFirstName("Gert");
        employee1.setMiddleName("Van");
        employee1.setSurName("den Branden");
        employee1.setSocialSecurityNumber("66052546710");

        employee2.setFirstName("Bert");
        employee2.setMiddleName("Van");
        employee2.setSurName("den Branden");
        employee2.setSocialSecurityNumber("66052546710");

        employee3.setFirstName("Bert");
        employee3.setMiddleName("Van");
        employee3.setSurName("den Branden");
        employee3.setSocialSecurityNumber("66052546710");

        employee4.setFirstName("Bert");
        employee4.setMiddleName("Van");
        employee4.setSurName("den Branden");
        employee4.setSocialSecurityNumber("66052546711");

        employee5.setFirstName("Bert");
        employee5.setMiddleName("Van");
        employee5.setSurName("den Branden");
        employee5.setSocialSecurityNumber("66052546710");

        Set employeeSet=new HashSet();

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);

        System.out.println("Er zitten "+employeeSet.size()+" namen in de setlijst");
    }







}
