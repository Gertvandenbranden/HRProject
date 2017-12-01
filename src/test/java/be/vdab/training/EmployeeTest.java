package be.vdab.training;

import static be.vdab.training.enums.Gender.FEMALE;
import static be.vdab.training.enums.Gender.MALE;
import static junit.framework.TestCase.assertEquals;
import be.vdab.training.domains.Employee;
import org.junit.Test;

import java.time.LocalDate;


public class EmployeeTest {

    @Test
    public void testEmployeeFirstName(){
        Employee employee=new Employee();
        employee.setFirstName("wim");

        assertEquals("getter en setter van first-name","wim",employee.getFirstName());
    //assert heeft meer argumenten dan Equals
    }

    @Test
    public void testEmployeeHappyFlow(){
        Employee employee=new Employee();
        employee.setFirstName("wim");
        employee.setSurName("Van Den Brande");
        employee.setBirthDate(LocalDate.of(1966,05,25));
        employee.setEntryDate(LocalDate.of(2017,11,13));
        employee.setSocialSecurityNumber("66052546710");
        employee.setGender(MALE);

        System.out.println("Aantal fouten ="+employee.validateWorkerListOfExceptions().size());
    if(employee.validateWorkerListOfExceptions().size()>0){
        for(String el:employee.validateWorkerListOfExceptions()){
            System.out.println(el);
        }
    }


       assertEquals("no missing properties",0 ,employee.validateWorkerListOfExceptions().size());
        //assert heeft meer argumenten dan Equals


    }


    @Test
    public void testEmployeeSadFlow(){
        Employee employee=new Employee();
        employee.setFirstName("wim");
//        employee.setSurName("Van Den Brande");
//        employee.setBirthDate(LocalDate.of(1966,05,25));
//        employee.setEntryDate(LocalDate.of(2017,11,13));
//        employee.setSocialSecurityNumber("66052546710");

        assertEquals("missing properties",3 ,employee.validateWorkerListOfExceptions().size());
        //assert heeft meer argumenten dan Equals
    }


}
