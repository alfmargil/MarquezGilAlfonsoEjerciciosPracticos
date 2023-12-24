/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Alfonso
 */
public class Animal
{

    private int id;
    private String nombre;
    private int edad;
    private String tipoDePiel;
    private String tipoDeAlimentacion;

    public Animal(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion)
    {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDePiel = tipoDePiel;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public Animal()
    {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getTipoDePiel()
    {
        return tipoDePiel;
    }

    public void setTipoDePiel(String tipoDePiel)
    {
        this.tipoDePiel = tipoDePiel;
    }

    public String getTipoDeAlimentacion()
    {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion)
    {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public void saludar()
    {
        System.out.println("Hola, soy un animal");
    }

}
