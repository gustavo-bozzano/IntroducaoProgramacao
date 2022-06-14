import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.close();

        System.out.println("Entre com um valor inteiro maior q 0: ");
        int valor = teclado.nextInt();

        if (valor % 2 == 0) {

            System.out.println("Par");

        } else {

            System.out.println("Impar");
        }
    }
}