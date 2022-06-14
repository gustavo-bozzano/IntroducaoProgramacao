import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe p:");
        int p = teclado.nextInt();
        int pMenor = 0;
        int contadorP = 0;

        for (int i = 0; i < p; i++) {
            System.out.println("Informe numeros: ");
            int numerosP = teclado.nextInt();

            if (numerosP < pMenor && numerosP < 0) {
                pMenor = numerosP;
            }
            contadorP = contadorP + numerosP;
        }
        teclado.close();
        int mediaP = contadorP / p;
        System.out.println("O número negativo é " + pMenor + " a media é " + mediaP);
    }
}
