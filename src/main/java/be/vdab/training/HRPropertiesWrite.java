package be.vdab.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class HRPropertiesWrite {
    public static void main(String[] args) {

        try (FileOutputStream out = new FileOutputStream("C:\\Gert\\HRProject\\src\\main\\resources\\ApplicationProperties");) {

            Properties atts = new Properties();
            atts.setProperty("EmployeeRemuneration", "2");
            atts.setProperty("ManagerRemuneration", "3");
            atts.setProperty("DirectorRemuneration", "4");
            atts.store(out, "Application.properties");


        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileOutputStream out =
                     new FileOutputStream("C:\\Gert\\HRProject\\src\\main\\resources\\ApplicationProperties.xml");) {

            Properties atts = new Properties();
            atts.setProperty("EmployeeRemuneration", "2");
            atts.setProperty("ManagerRemuneration", "3");
            atts.setProperty("DirectorRemuneration", "4");
            atts.storeToXML(out, "Application_properties.xml");


        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream in = new FileInputStream("C:\\Gert\\HRProject\\src\\main\\resources\\ApplicationProperties");) {
            Properties atts = new Properties();
            atts.load(in);
            atts.list(System.out);

        } catch (java.io.IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
