
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;

public class Uri1021 {
    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        DecimalFormat pimba = new DecimalFormat("0");

        double valor = teclado.nextDouble();
        teclado.close();

        System.out.println("NOTAS:");
        int qtd100 = (int) valor / 100;
        double resto100 = valor % 100;
        System.out.println(qtd100 + " nota(s) de R$ 100.00");

        int qtd50 = (int) resto100 / 50;
        double resto50 = resto100 % 50;
        System.out.println(qtd50 + " nota(s) de R$ 50.00");

        int qtd20 = (int) resto50 / 20;
        double resto20 = resto50 % 20;
        System.out.println(qtd20 + " nota(s) de R$ 20.00");

        int qtd10 = (int) resto20 / 10;
        double resto10 = resto20 % 10;
        System.out.println(qtd10 + " nota(s) de R$ 10.00");

        int qtd5 = (int) resto10 / 5;
        double resto5 = resto10 % 5;
        System.out.println(qtd5 + " nota(s) de R$ 5.00");

        int qtd2 = (int) resto5 / 2;
        double resto2 = resto5 % 2;
        System.out.println(qtd2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        int qtd1 = (int) resto2 / 1;
        double resto1 = resto2 % 1;
        System.out.println(qtd1 + " moeda(s) de R$ 1.00");

        resto1 = resto1 * 100;

        int qtd050 = (int) resto1 / 50;
        double resto050 = resto1 % 50;
        System.out.println(qtd050 + " moeda(s) de R$ 0.50");

        int qtd025 = (int) resto050 / 25;
        double resto025 = resto050 % 25;
        System.out.println(qtd025 + " moeda(s) de R$ 0.25");

        int qtd010 = (int) (resto025) / 10;
        double resto010 = resto025 % 10;
        System.out.println(qtd010 + " moeda(s) de R$ 0.10");

        int qtd005 = (int) resto010 / 5;
        double resto005 = resto010 % 5;
        System.out.println(qtd005 + " moeda(s) de R$ 0.05");

        double qtd001 = resto005 / 1;

        System.out.println(pimba.format(qtd001) + " moeda(s) de R$ 0.01");

    }
}