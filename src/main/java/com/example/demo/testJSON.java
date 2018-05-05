package com.example.demo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;


public class testJSON {

    JSONObject file;

    public testJSON() throws JSONException {
        this.file = getContent("https://cplepage.com/hackQC/resultat.json");

    }

    public JSONObject getContent(String url) throws JSONException {
        try {
            return new JSONObject(IOUtils.toString(new URL(url), Charset.forName("UTF-8")));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new JSONObject("failed");
    }

    @JsonRawValue
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFile() {
        return this.file.toString();
    }

}
