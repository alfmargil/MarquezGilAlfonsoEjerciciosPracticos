
public class Persona {

    int id, edad, tlf;
    String nombre, direccion;

    public Persona(int id, int edad, int tlf, String nombre, String direccion) {
        this.id = id;
        this.edad = edad;
        this.tlf = tlf;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Persona() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
