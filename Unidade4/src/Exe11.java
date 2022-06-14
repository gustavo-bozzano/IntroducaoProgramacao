import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int irmao1 = teclado.nextInt();
        int irmao2 = teclado.nextInt();
        int irmao3 = teclado.nextInt();
        teclado.close();

        if (irmao1 == irmao2 && irmao2 == irmao3) {
            System.out.println("Trigemeos");

        } else if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
            System.out.println("Gemeos");

        } else if (irmao1 != irmao2 && irmao1 != irmao3 && irmao2 != irmao3) {
            System.out.println("Diferentes");
        }
    }
}