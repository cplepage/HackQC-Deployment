package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileReader;
import java.io.IOException;


public class testJSON {

    JSONObject file;

    public testJSON(){
        try {
            Resource resource = new ClassPathResource("test-risque.json");
            JSONParser parser = new JSONParser();
            //Use JSONObject for simple JSON and JSONArray for array of JSON.
            JSONObject data = (JSONObject) parser.parse(
                    new FileReader(resource.getFile()));//path to the JSON file.
            this.file = data;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @JsonRawValue
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFile() {
        return this.file.toString();
    }

}
