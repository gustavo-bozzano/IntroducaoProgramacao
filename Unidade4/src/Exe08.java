import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a letra: ");
        char entrada = teclado.next().charAt(0);
        teclado.close();

        if ( entrada == 'a' || entrada == 'e' || entrada == 'i' || entrada == 'o' || entrada == 'u') {
            System.out.println("Vogal");
        } else {
            System.out.println("N e vogal");
        }
    }
}
