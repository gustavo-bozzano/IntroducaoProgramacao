import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double dolar = teclado.nextDouble();
        double cotacao = teclado.nextDouble();

        double real = cotacao * dolar;
        System.out.print(deci.format(real) + " reais");

        teclado.close();
    }
}