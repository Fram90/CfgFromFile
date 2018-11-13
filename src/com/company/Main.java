package com.company;


public class Main {

    public static void main(String[] args) throws Exception {
        ConfigProvider.Init("test.json");

        String value = ConfigProvider.read("qwe");
    }
}
