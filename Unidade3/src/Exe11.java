import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        double graus = teclado.nextDouble();

        double fahrenheit = graus * 1.8 + 32;

        System.out.println(deci.format(fahrenheit));
        teclado.close();
    }
}