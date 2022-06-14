import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Uri1015 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0000");

        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double distancia = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 -y1));
        double distanciaRaiz = Math.sqrt(distancia);

        System.out.println(deci.format(distanciaRaiz));

        teclado.close();
    }
}