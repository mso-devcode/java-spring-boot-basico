package com.mso.api_ai.configuration;

public class Capitalizer {
    
    public static String converterName (String name) {

        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
