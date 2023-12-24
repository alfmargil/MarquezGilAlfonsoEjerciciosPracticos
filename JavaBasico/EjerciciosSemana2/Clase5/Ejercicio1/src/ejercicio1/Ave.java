/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Alfonso
 */
public class Ave extends Animal
{

    double envAlas;
    String tipoVuelo;
    String colorPlumaje;
    String tipoPico;

    public Ave(double envAlas, String tipoVuelo, String colorPlumaje, String tipoPico, int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion)
    {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.envAlas = envAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    public Ave()
    {

    }

    @Override
    public void saludar()
    {
        System.out.println("Hola, soy un Ave");
    }

    public double getEnvAlas()
    {
        return envAlas;
    }

    public void setEnvAlas(double envAlas)
    {
        this.envAlas = envAlas;
    }

    public String getTipoVuelo()
    {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo)
    {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPlumaje()
    {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje)
    {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico()
    {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico)
    {
        this.tipoPico = tipoPico;
    }

}
