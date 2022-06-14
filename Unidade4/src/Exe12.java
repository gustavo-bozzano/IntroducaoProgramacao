import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Lado 1 ");
        int lado1 = teclado.nextInt();
        System.out.println("Lado 2 ");
        int lado2 = teclado.nextInt();
        System.out.println("Lado 3 ");
        int lado3 = teclado.nextInt();
        teclado.close();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Equilatero");
            } else {
                if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                    System.out.println("Isoceles");
                } else {
                    System.out.println("Escaleno");
                }
            }
        } else {
            System.out.println("N eh triangulo");
        }
    }
}