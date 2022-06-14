import java.util.Scanner;

// Descreva um algoritmo que leia um número inteiro n e,
// dados x números reais informe o maior e o menor número.
public class Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor de N");
        int n = teclado.nextInt();
        int numMe = 0;
        int numMa = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Insira os numeros");
            int numN = teclado.nextInt();

            if (numN > numMa) {
                numMa = numN;
            }
            if (numN < numMe) {
                numMe = numN;
            }
        }
        System.out.println("Numero menor: " + numMe + "\nNumero maior: " + numMa);
        teclado.close();
    }
}
