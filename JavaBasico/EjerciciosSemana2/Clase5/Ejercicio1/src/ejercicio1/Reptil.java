/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Alfonso
 */
public class Reptil extends Animal
{

    double longitud;
    String tipoEscamas;
    String tipoVeneno;
    String habitat;

    public Reptil(double longitud, String tipoEscamas, String tipoVeneno, String habitat, int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion)
    {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    public Reptil()
    {
    }

    @Override
    public void saludar()
    {
        System.out.println("Hola, soy un reptil");
    }
    
    

    public double getLongitud()
    {
        return longitud;
    }

    public void setLongitud(double longitud)
    {
        this.longitud = longitud;
    }

    public String getTipoEscamas()
    {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas)
    {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno()
    {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno)
    {
        this.tipoVeneno = tipoVeneno;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

}
