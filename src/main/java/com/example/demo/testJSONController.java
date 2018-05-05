package com.example.demo;


import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testJSONController {


    @RequestMapping(value = "/api/JSON", produces = "application/json")
    public @ResponseBody testJSON testJSONController() throws JSONException {
        return new testJSON();
    }
}