package src;

import java.util.Scanner;

/**
 *
 * @author Alfonso
 */
public class Main {

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();

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

    // Ejercicio 4
    public static void ejercicio4() {
        System.out.println("\nEjercicio 4:");

        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero 1: ");
        num1 = sc.nextInt();
        System.out.println("Introduzca el numero 2: ");
        num2 = sc.nextInt();
        System.out.println("La suma de ambos es: " + (num1 + num2));
        System.out.println("La resta del segundo numero al primero es: " + (num1 - num2));
        System.out.println("La multiplicación es: " + (num1 * num2));
        System.out.println("La división del primero entre el segundo es: " + (num1 / num2));

    }

}
