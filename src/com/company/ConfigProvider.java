package com.company;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ConfigProvider {
    private static JSONObject _config;

    public static void Init(String sourceFile) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(sourceFile));

        _config = (JSONObject) obj;
    }

    public static String read(String key) throws Exception {
        if (_config == null)
            throw new Exception("ConfigProvider not initialized");

        String value = (String) _config.get(key);
        return value;
    }
}


