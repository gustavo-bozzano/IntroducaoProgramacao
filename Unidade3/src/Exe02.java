import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        double produto;

        produto = teclado.nextDouble();

        double prodDesc = produto * 0.88;

        System.out.println("Valor do desconto: " + 12 % prodDesc);
        System.out.println("Valor do produto com desconto: " + prodDesc);

        teclado.close();

    }
}