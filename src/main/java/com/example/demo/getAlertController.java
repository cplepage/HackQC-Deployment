package com.example.demo;


import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("api")
public class getAlertController {

    @Autowired
    @RequestMapping(value = "/latest", produces = "application/json")
    public @ResponseBody
    String getAlertController() throws JSONException {

        return new getAlert().getFile();
    }
}