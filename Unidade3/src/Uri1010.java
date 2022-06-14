
/*
 * Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2,
 * o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre
 * o valor a ser pago.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        int codigo1 = teclado.nextInt();
        int qtd1 = teclado.nextInt();
        double valor1 = teclado.nextDouble();
        int codigo2 = teclado.nextInt();
        int qtd2 = teclado.nextInt();
        double valor2 = teclado.nextDouble();

        double total = (qtd1 * valor1) + (qtd2 * valor2);
        System.out.println("VALOR A PAGAR: R$ " + deci.format(total));

        teclado.close();

    }
}