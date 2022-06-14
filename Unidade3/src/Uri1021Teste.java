
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;

public class Uri1021Teste {
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
        System.out.println(qtd20 + " notas(s) de R$ 20.00");


        double qtd001 = resto20 / 1;

        System.out.println(pimba.format(qtd001) + " moeda(s) de R$ 0.01");

    }
}