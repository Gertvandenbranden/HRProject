package be.vdab.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HRPropertiesRead {
    public static void main(String[] args) {

        try (FileInputStream in =
                     new FileInputStream("C:\\Gert\\HRProject\\src\\main\\resources\\ApplicationProperties.xml");) {

            Properties atts = new Properties();
            atts.loadFromXML(in);
            atts.list(System.out);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }





//int EmployeeRemuneration=
//        Integer.valueOf((String) HRApplication.ApplicationProperties.get("EmployeeRemuneration"));


    }
}

