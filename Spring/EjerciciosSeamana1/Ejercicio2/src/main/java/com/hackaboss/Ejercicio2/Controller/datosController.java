package com.hackaboss.Ejercicio2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class datosController {

    String[] datos = new String[5];

    private void inicializarDatos()
    {
        datos[0] = "El corazón de una ballena azul es tan grande que un ser humano podría nadar a través de sus arterias";
        datos[1] = "Las abejas son capaces de reconocer rostros humanos";
        datos[2] = "En el espacio, no hay sonido porque no hay aire para transportar las ondas sonoras";
        datos[3] = "Un pulpo tiene tres corazones y sangre azul porque utiliza cobre en lugar de hierro para transportar oxígeno";
        datos[4] = "Las huellas dactilares de los koalas son prácticamente indistinguibles de las de los humanos, incluso bajo un microscopio";
    }


    @GetMapping
    public String generarDatoCurioso(){

        inicializarDatos();
        Random r = new Random();
        return datos[r.nextInt(5)];
    }

}
