import java.util.Scanner;

//Uma loja de departamentos oferece para seus clientes um determinado desconto de acordo com o valor da compra efetuada. O desconto é de 20% caso o valor da compra seja maior que R$ 500,00 e de 15% caso seja menor ou igual. Descreva um algoritmo que leia o valor da compra e escreva o total a pagar a cada compra. Informe também o valor total recebido pela loja ao final do dia. A leitura deve ser finalizada com a leitura 0 para o valor da compra.

public class Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe valor da compra");
        double compra = teclado.nextDouble();

        double valorLoja = 0;
        double valorCliente = 0;

        do {
            if (compra > 500) {
                valorCliente = compra - (compra * 0.2);
            } else {
                valorCliente = compra - (compra * 0.15);
            }
            System.out.println("Total a pagar da conta: " + valorCliente);
            valorLoja += valorCliente;

            System.out.println("Informe valor da compra");
            compra = teclado.nextDouble();
        } while (compra != 0);

        System.out.println("Lucro da loja: " + valorLoja);
        teclado.close();
    }
}
