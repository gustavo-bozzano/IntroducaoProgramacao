import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char entrada = teclado.next().charAt(0);
        teclado.close();

        if (entrada == 'F') {
            System.out.println("Feminino");
        } else if (entrada == 'M') {
            System.out.println("Masculino");
        } else if (entrada == 'I') {
            System.out.println("Nao informado");
        } else {
            System.out.println("Entrada incorreta");
        }
    }
}