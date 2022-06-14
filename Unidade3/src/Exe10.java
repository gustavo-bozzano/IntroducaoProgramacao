import java.util.Scanner;
import java.lang.Math;

public class Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double cateto1 = teclado.nextDouble();
        double cateto2 = teclado.nextDouble();
        double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        hipotenusa = Math.sqrt(hipotenusa); 

        System.out.println(hipotenusa);
        teclado.close();
    }
}