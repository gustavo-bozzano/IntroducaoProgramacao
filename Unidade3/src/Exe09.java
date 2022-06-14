import java.util.Scanner;
import java.lang.Math;

public class Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double raio = teclado.nextDouble();
        double altura = teclado.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.println(volume);
        teclado.close();
    }
}