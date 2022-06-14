import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int rsPorKg = 25;
        double pesoKg = teclado.nextDouble();
        double total = (rsPorKg * pesoKg) - 0.750;

        System.out.println(total);
        teclado.close();
    }
}