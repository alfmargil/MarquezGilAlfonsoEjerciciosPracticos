import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] asientos = new char[5][5];
        inicializarAsientos(asientos);

        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al sistema de reservas de asientos!");
        boolean reservando = true;

        while (reservando) {
            mostrarMapa(asientos);

            System.out.print("Ingrese la fila (de 1 a 5) y el número de asiento (de 1 a 5) separados por espacio: ");
            int fila = sc.nextInt();
            int asiento = sc.nextInt();

            if (fila < 1 || fila > 5 || asiento < 1 || asiento > 5) {
                System.out.println("Por favor, ingrese valores válidos (fila de 1 a 5 y asiento de 1 a 5).");
                continue;
            }

            if (asientos[fila - 1][asiento - 1] == 'X') {
                System.out.println("¡El asiento ya está ocupado! Por favor, elija otro.");
            } else {
                asientos[fila - 1][asiento - 1] = 'X';
                System.out.println("¡Reserva exitosa en la fila " + fila + ", asiento " + asiento + "!");
            }

            System.out.print("¿Desea hacer otra reserva? (Sí/No): ");
            String continuar = sc.next();
            if (continuar.equalsIgnoreCase("No")) {
                reservando = false;
            }
        }

        System.out.println("¡Gracias por usar el sistema de reservas!");
        sc.close();
    }

    private static void inicializarAsientos(char[][] asientos) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                asientos[i][j] = 'O';
            }
        }
    }

    private static void mostrarMapa(char[][] asientos) {
        System.out.println("Mapa de asientos:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
