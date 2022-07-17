package com.sanjay.dockerdemo.controller;



import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/cars")
public class DockerDemoController {

    @GetMapping
    public List<String> getAllCars(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda","Fiat"};
        return Arrays.asList(cars);
    }
}
