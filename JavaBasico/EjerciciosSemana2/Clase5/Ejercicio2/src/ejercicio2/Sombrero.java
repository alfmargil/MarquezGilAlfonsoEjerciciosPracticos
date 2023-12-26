package ejercicio2;

/**
 *
 * @author Alfonso
 */
public class Sombrero extends Vestimenta
{
    
    String tipo;
    String tamano;

    public Sombrero(String tipo, String tamano, int codigo, String nombre, double precio, String marca, String talla, String color)
    {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public String getTamano()
    {
        return tamano;
    }

    public void setTamano(String tamano)
    {
        this.tamano = tamano;
    }
    
    
    
}
