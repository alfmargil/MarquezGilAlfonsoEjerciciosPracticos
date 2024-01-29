package com.hackaboss.Ejercicio1.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class conversorController {

    @GetMapping("/convertir")
    public String convertir(@RequestParam("centimetros") double centimetros){

        double metros = centimetros / 100;

        return centimetros + "cm convertido a metros es: " + metros + "m";

    }

}
