import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double precio;
        double total = 0.0;
        boolean finalizar = false;
        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Ingrese el precio del siguiente producto: ");
            precio = sc.nextDouble();

            if (precio <= 0) {
                finalizar = true;
            } else {
                total += precio;
            }


        } while (!finalizar);

        System.out.println("El total de la compra es: " + total);

        sc.close();
    }
}