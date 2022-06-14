import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1002 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        double n = 3.14159;
        double raio = teclado.nextDouble();
        double area = n * raio * raio;

        DecimalFormat deci = new DecimalFormat("0.0000");

        System.out.println("A=" + deci.format(area));
        teclado.close();

    }
}