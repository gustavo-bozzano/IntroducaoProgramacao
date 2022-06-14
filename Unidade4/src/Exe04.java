import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nume = teclado.nextDouble();
        teclado.close();

        if (nume != (int) nume) {
            System.out.println("Tem casas decimais");
        } else {
            System.out.println("N tem");

        }
    }
}
