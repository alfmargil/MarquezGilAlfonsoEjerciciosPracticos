package ejercicio1;

/**
 *
 * @author Alfonso
 */
public class Mamifero extends Animal
{

    private int numPatas;
    private String colorPelaje;
    private String habitat;
    private String tipoReproduccion;

    public Mamifero(int numPatas, String colorPelaje, String habitat, String tipoReproduccion, int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion)
    {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.numPatas = numPatas;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
        this.tipoReproduccion = tipoReproduccion;
    }

    public Mamifero()
    {
    }

    @Override
    public void saludar()
    {
        System.out.println("Hola, soy un Mamifero");
    }

    public int getNumPatas()
    {
        return numPatas;
    }

    public void setNumPatas(int numPatas)
    {
        this.numPatas = numPatas;
    }

    public String getColorPelaje()
    {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje)
    {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitat()
    {
        return habitat;
    }

    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }

    public String getTipoReproduccion()
    {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion)
    {
        this.tipoReproduccion = tipoReproduccion;
    }

}
