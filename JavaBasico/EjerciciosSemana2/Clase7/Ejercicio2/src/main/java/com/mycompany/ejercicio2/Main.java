package com.mycompany.ejercicio2;

import persistance.*;
import models.*;

/**
 *
 * @author Alfonso Márquez Gil
 */
public class Main
{

    public static void main(String[] args)
    {

        PlatilloService platilloService = new PlatilloService();

        Platillo platillo1 = new Platillo();
        platillo1.setNombre("Plato 1");
        platillo1.setReceta("Receta 1");
        platillo1.setPrecio(12.99);

        Platillo platillo2 = new Platillo();
        platillo2.setNombre("Platillo2");
        platillo2.setReceta("Receta2");
        platillo2.setPrecio(12.99);

        platilloService.agregarNuevoPlatillo(platillo1);
        platilloService.agregarNuevoPlatillo(platillo2);

    }

}
