package models;

/**
 *
 * @author Alfonso
 */
public class Camioneta extends Vehiculo implements Combustion
{

    private int capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int año, double costo, int capacidadTanque, double consumoCombustible)
    {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public int calcularAntiguedad()
    {
        return 2023 - this.año;
    }

    @Override
    public void recargarCombustible()
    {
        System.out.println("Recargando combustible de la Camioneta de Combustion");
    }

}
