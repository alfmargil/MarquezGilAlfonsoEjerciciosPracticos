package ejercicio2;

/**
 *
 * @author Alfonso
 */
public class Pantalon extends Vestimenta
{

    String estilo;
    String tipoTejido;

    public Pantalon(String estilo, String tipoTejido, int codigo, String nombre, double precio, String marca, String talla, String color)
    {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo()
    {
        return estilo;
    }

    public void setEstilo(String estilo)
    {
        this.estilo = estilo;
    }

    public String getTipoTejido()
    {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido)
    {
        this.tipoTejido = tipoTejido;
    }

    public void mostrarMensaje()
    {
        System.out.println("Estos pantalones son de estilo: " + getEstilo());
    }

}
