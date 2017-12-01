package be.vdab.training;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.rmi.transport.Connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class HRApplication {

    private static final Logger LOGGER = LogManager.getLogger(HRApplication.class);

    public static Properties HRAppProperties;

    public static void main(String[] args) throws IOException {
        Connection connection = null;

        // properties inlezen via class HRPropertiesRead






        //gebruik placeholders, stuurt info naar logger voor debugger, beter dan sout
        LOGGER.info("Testje van logging {}{}",null,null);

        LOGGER.debug("Somebody called SayHello");




    }
}


