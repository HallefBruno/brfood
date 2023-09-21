package br.com.company.brfood.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadProperties {

    private static ReadProperties readProperties;

    private ReadProperties() {
    }

    public static ReadProperties getInstance() {
        if (readProperties == null) {
            readProperties = new ReadProperties();
        }
        return readProperties;
    }

    public Map<String, String> configConnection() {
        try (InputStream input = new FileInputStream("src/resources/application.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            Map<String, String> conf = new HashMap<>();
            conf.put("url", prop.getProperty("database.url"));
            conf.put("user", prop.getProperty("database.username"));
            conf.put("password", prop.getProperty("database.password"));

            return conf;

        } catch (IOException io) {
            throw new RuntimeException(io.getMessage());
        }
    }

}
