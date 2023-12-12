package src;

/**
 *
 * @author Alfonso
 */
public class Main {

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();

    }

    // Ejercicio 1
    public static void ejercicio1() {
        System.out.println("Ejercicio 1:");

        System.out.println("Bienvenidos al sistema");

    }

    // Ejercicio 2
    public static void ejercicio2() {
        System.out.println("\nEjercicio 2:");

        int number = 3;
        double number2 = 5.39;
        boolean estado = true;
        String cadena = "Hola";
        System.out.println("El int es: " + number + "\nEl double es: " + number2 + "\nEl boolean es: " + estado + "\nEl String es: " + cadena);

    }

    // Ejercicio 3
    public static void ejercicio3() {
        System.out.println("\nEjercicio 3:");
        double base, altura, area;
        base = 10;
        altura = 7;
        area = (base * altura) / 2;

        System.out.println("El area del triangulo de base " + base + " y altura " + altura + " es: " + area);

    }

}
