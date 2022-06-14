import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();  
        teclado.close();
        if (a > b) {

            System.out.println("A maior q B");

        } else {

            System.out.println("B maior q A");

        }
    }
}