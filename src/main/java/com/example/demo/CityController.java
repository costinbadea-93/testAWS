package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testApi")
public class CityController {
    @GetMapping(value = "/test")
    public String getWishesByCountry() {
        return "Te iubesc morcoveata !!!";
    }
}


