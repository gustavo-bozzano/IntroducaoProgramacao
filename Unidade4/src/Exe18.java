import java.util.Scanner;
// Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.

public class Exe18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o dia do vencimnto:");
        int vencimento = teclado.nextInt();
        System.out.println("Qual o dia do pagamento:");
        int pagamento = teclado.nextInt();
        System.out.println("Qual o valor da fatura:");
        double fatura = teclado.nextInt();

        if (pagamento <= vencimento) {
            System.out.println("pagamento em dia");
            Double desc = fatura - (fatura * 0.1);
            System.out.println("Valor com desconto =" + desc);
        } else {
            if (pagamento - vencimento <= 5) {
                System.out.println("Pagamento regularizado Fatura = " + fatura);
            } else {
                double multa = fatura + (pagamento - vencimento * 0.2);
                System.out.println("Fatura com multa = " + multa);

            }
        }
        teclado.close();
    }
}