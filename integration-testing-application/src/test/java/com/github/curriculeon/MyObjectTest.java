package com.github.curriculeon;

import com.github.curriculeon.utils.DirectoryReference;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Test;

public class MyObjectTest {
    @Test
    public void test() {
        PropertiesConfiguration config = new PropertiesConfiguration();
        try {
            config.load(DirectoryReference.MAIN_RESOURCE_DIRECTORY.getFileFromDirectory("application.properties"));
        } catch (ConfigurationException e) {
            throw new RuntimeException(e);
        }
        System.out.println(config.getInt("someKey"));
    }
}