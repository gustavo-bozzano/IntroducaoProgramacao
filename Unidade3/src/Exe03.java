import java.util.Scanner;

//er o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele conseguiu colocar no tanque.
public class Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double valorLitro;
        double valor;

        System.out.println("Informe o valor do litro e quanto deseja pagar: ");
        valorLitro = teclado.nextDouble();
        valor = teclado.nextDouble();

        System.out.println("Vc conseguiu botar: " + valor / valorLitro + " litros");


        teclado.close();
    }
}
