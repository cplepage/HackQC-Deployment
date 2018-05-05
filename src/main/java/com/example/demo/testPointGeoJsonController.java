package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testPointGeoJsonController {


    @RequestMapping("/api/testPoint")
    public testPointGeoJson testPointGeoJsonController() {
        return new testPointGeoJson();
    }
}