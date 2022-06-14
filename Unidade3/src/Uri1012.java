import java.util.Scanner;
import java.text.DecimalFormat;

public class Uri1012 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.000");

        double pi = 3.14159;
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();

        double triangulo = (A * C) / 2;
        System.out.println("TRIANGULO: " + deci.format(triangulo));

        double circulo = pi * (C * C);
        System.out.println("CIRCULO: " + deci.format(circulo));

        double trapezio = (A + B) * C / 2;
        System.out.println("TRAPEZIO: " + deci.format(trapezio));

        double quadrado = B * B;
        System.out.println("QUADRADO: " + deci.format(quadrado));

        double retangulo = A * B;
        System.out.println("RETANGULO: " + deci.format(retangulo));

        teclado.close();
    }
}
