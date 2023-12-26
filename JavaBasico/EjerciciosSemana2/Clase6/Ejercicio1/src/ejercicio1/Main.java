package ejercicio1;

import java.util.ArrayList;
import models.*;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Auto autoElectrico = new Auto(1, "ABC123", "Tesla", "Model S", 2020, 50000, 100, 8);
        Camioneta camionetaCombustion = new Camioneta(2, "DEF456", "Toyota", "Hilux", 2019, 60000, 80, 12);
        Moto motoCombustion = new Moto(3, "GHI789", "Honda", "CBR500R", 2021, 8000, 500, "4");

        vehiculos.add(autoElectrico);
        vehiculos.add(camionetaCombustion);
        vehiculos.add(motoCombustion);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Informacion del vehiculo:");
            System.out.println("ID: " + vehiculo.getId());
            System.out.println("Placa: " + vehiculo.getPlaca());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Año: " + vehiculo.getAño());
            System.out.println("Costo: " + vehiculo.getCosto() + " €");
            System.out.println("Antigüedad: " + vehiculo.calcularAntiguedad() + " años");

            if (vehiculo instanceof Electrico) {
                ((Electrico) vehiculo).cargarEnergia();
            } else if (vehiculo instanceof Combustion) {
                ((Combustion) vehiculo).recargarCombustible();
            }

        }

    }

}
