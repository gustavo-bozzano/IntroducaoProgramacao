import java.util.Scanner;
import java.text.DecimalFormat;

//Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro). 
//Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar o total a receber no final do m�s, com duas casas decimais.

public class Uri1009 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        String vendedor;
        double salario;
        double vendas;

        vendedor = teclado.nextLine();
        salario = teclado.nextDouble();
        vendas = teclado.nextDouble();

        double total = salario + (vendas * 0.15);
        System.out.println("TOTAL = R$ " + deci.format(total));

        teclado.close();
    }
}