package models;

/**
 *
 * @author Alfonso Márquez Gil
 */
public class Estudiantes
{
    int id;
    String nombre;
    int edad;
    double calificacion;

    public Estudiantes(int id, String nombre, int edad, double calificacion)
    {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
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

    public double getCalificacion()
    {
        return calificacion;
    }

    public void setCalificacion(double calificacion)
    {
        this.calificacion = calificacion;
    }
    
    
    
}
