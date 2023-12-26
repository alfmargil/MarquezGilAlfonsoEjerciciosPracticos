/*

 */
package ejercicio2;

/**
 *
 * @author Alfonso
 */
public class Zapato extends Vestimenta
{
    
    String material;
    String tipoCierre;

    public Zapato(String material, String tipoCierre, int codigo, String nombre, double precio, String marca, String talla, String color)
    {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }
    

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public String getTipoCierre()
    {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre)
    {
        this.tipoCierre = tipoCierre;
    }
    
    
    
}
