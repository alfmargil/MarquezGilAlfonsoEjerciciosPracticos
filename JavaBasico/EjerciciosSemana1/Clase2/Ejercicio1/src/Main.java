import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al recital, ingrese su edad para continuar: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        if(edad<18) {
            System.out.println("Lo sentimos mucho, acceso solo para mayores de edad");
        }else {
            System.out.println("Disfrute del recital");
        }

    }
}