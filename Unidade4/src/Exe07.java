import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o peso da carta: ");
        int peso = teclado.nextInt();
        double valorPagar = 0;
        teclado.close();

        if (peso <= 50) {

            valorPagar = 0.45;

        } else {

            int pesoExcedido = peso - 50;
            double qtdAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtdAdicional;

        }
        System.out.println("Custo do selo: " + valorPagar);
    }
}
