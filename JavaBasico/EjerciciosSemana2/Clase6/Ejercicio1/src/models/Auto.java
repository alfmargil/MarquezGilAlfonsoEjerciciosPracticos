package models;

/**
 *
 * @author Alfonso
 */
public class Auto extends Vehiculo implements Electrico
{

    private int capacidadBateria;
    private double autonomia;

    public Auto(int id, String placa, String marca, String modelo, int año, double costo, int capacidadBateria, double autonomia)
    {
        super(id, placa, marca, modelo, año, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public int calcularAntiguedad()
    {
        return 2023 - this.año;
    }

    @Override
    public void cargarEnergia()
    {
        System.out.println("Cargando energía en el auto eléctrico...");
    }

}
