import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tempSemanal[] = new double[7];
        double total = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tempSemanal.length; i++) {
            System.out.println("Introduzca la temperatura máxima del dia " + (i + 1));
            double temp = sc.nextDouble();
            total += temp;
        }
        sc.close();
        System.out.println("Temperatura máxima media de la semana: " + (total / 7.0) + "ºC");


    }
}