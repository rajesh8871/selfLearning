package com.example.awsdemoapp.config;

public class ConfigReader {
    public static void load() {
        String instCfgFileName = System.getProperty("omp.conf");
        System.out.println("hii:" + instCfgFileName);
    }

}
