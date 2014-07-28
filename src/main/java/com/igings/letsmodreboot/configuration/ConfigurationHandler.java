package com.igings.letsmodreboot.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;

    public static void init(File configFile) {
        //Create the config object from the given config file
        configuration = new Configuration(configFile);
        boolean configValue=false;
        String stringValue="Koagu";
        try
        {
            //Load the config file
            configuration.load();

            //Read in properties from the config file
            configValue=configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example config value").getBoolean(true);
            stringValue=configuration.get(Configuration.CATEGORY_GENERAL, "stringValue", "Igings","This is a test string value").getString();
        }
        catch (Exception e)
        {
            //log the exception
        }
        finally
        {
            //Save the config file
            configuration.save();
        }
        System.out.println("Config Value = " + configValue);
        System.out.println("String Value = " + stringValue);
    }
}
