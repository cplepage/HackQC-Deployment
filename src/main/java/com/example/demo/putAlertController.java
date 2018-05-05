package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
public class putAlertController {

    @RequestMapping(value = "/api/putAlert")
    public @ResponseBody putAlert putAlertController(
            @RequestParam(value = "type") String type,
            @RequestParam(value = "lat") double lat,
            @RequestParam(value = "lng") double lng
    ) throws IOException {
        return new putAlert(type, new double[]{lat, lng});
    }
}