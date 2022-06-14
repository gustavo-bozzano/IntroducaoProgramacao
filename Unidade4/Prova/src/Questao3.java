import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o tipo");
        char entrada = teclado.next().charAt(0);
        teclado.close();

        if (entrada == 'V') {
            System.out.println("Verde");
        } else if (entrada == 'A') {
            System.out.println("Azul");
        } else if (entrada == 'B') {
            System.out.println("Branco");
        } else {
            System.out.println("Tipo incorreto");
        }
    }
}
