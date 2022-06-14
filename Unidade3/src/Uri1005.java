import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1005 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double nota1;
        double nota2;
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();

        double media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;

        DecimalFormat deci = new DecimalFormat("0.00000");

        System.out.println("MEDIA = " + deci.format(media));

        teclado.close();
    }
}
