public class Main {
    public static void main(String[] args) {

        Persona[] personas = new Persona[5];
        personas[0] = new Persona(1, 20, 490139, "Pepe", "Madrid");
        personas[1] = new Persona(2, 30, 401928, "Laura", "Granada");
        personas[2] = new Persona(3, 26, 185092, "Cristina", "Soria");
        personas[3] = new Persona(4, 50, 290173, "Manuel", "Valencia");
        personas[4] = new Persona(5, 33, 189023, "Fernando", "Oviedo");

        // Recorro el vector y muestro el contenido

        for (Persona persona : personas) {

            System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());

        }

        // Cambio el nombre de dos personas, elijo la posicion 0 y 3

        System.out.println("Antes del cambio: ");
        System.out.println(personas[0].getNombre());
        personas[0].setNombre("Juan");
        System.out.println(personas[3].getNombre());
        personas[3].setNombre("Rogelio");
        System.out.println("Después del cambio: ");
        System.out.println(personas[0].getNombre());
        System.out.println(personas[3].getNombre());

        // Recorro el vector mostrando solo aquellos cuya edad sea mayor a 30

        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre: " + persona.getNombre() + " Edad: " + persona.getEdad());
            }
        }


    }
}