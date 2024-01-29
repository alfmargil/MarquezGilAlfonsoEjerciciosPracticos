package com.hackaboss.Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class refranesController {

    String[] refranes = new String[5];

    public void inicializarRefranes()
    {
        refranes[0] = "Más vale pájaro en mano que cientos volando";
        refranes[1] = "Más vale tarde que nunca";
        refranes[2] = "Más vale prevenir que lamentar";
        refranes[3] = "No hay mal que por bien no venga";
        refranes[4] = "A quién madruga, Dios le ayuda";

    }


    @GetMapping
    public String refranes()
    {
        inicializarRefranes();
        Random r = new Random();
        return refranes[r.nextInt(5];
    }

}
