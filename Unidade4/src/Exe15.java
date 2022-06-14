import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Meses: ");
        int meses = teclado.nextInt();
        System.out.println("Salario: ");
        double salario = teclado.nextDouble();
        teclado.close();

        if (meses <= 11) {
            System.out.println((salario * 0.05) + salario);
        }
        if (meses >= 12 && meses < 49) {
            System.out.println((salario * 0.07) + salario);
        }
    }
}