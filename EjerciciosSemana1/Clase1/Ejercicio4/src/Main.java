public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4:");
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