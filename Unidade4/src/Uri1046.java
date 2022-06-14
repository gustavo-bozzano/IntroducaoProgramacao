import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int inicio = teclado.nextInt();
        int fim = teclado.nextInt();

        if (inicio > fim) { 
            System.out.println("O JOGO DUROU " + (24 - (inicio - fim)) + " HORA(S)");
        } else if (fim > inicio) {
            System.out.println("O JOGO DUROU " + (fim - inicio) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        teclado.close();
    }
}
