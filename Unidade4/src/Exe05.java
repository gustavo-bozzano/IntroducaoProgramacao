import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cor azul?");
        boolean resultado = teclado.nextBoolean();
        teclado.close();

        if (resultado == true) {
            System.out.println("Sim");

        } else {
            System.out.println("Nao");

        }
    }
}
