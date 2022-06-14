    import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor da compra");
        double valor = teclado.nextDouble();
        System.out.println("Escolha a sua forma de pagamento: 1 - Debito, 2 - Pix, 3 - Crediario");
        int formaPag = teclado.nextInt();

        switch (formaPag) {
            case 1:
                valor = valor + (valor * 0.03);
                System.out.println("Total = " + valor);
                break;

            case 2:
                valor = valor - (valor * 0.05);
                break;

            case 3:
                System.out.println("Informe em quantas vezes");
                int vezes = teclado.nextInt();
                System.out.println("Informe data do vencimento");
                int vencimento = teclado.nextInt();
                System.out.println("Voce pagou dia:");
                int pagamento = teclado.nextInt();

                if (pagamento <= vencimento) {
                    valor = valor - (valor * 0.15);
                    valor = valor / vezes;
                    System.out.println("Pagamento em dia. Valor em " + vezes + " vezes de " + valor);
                }

                if (pagamento - vencimento <= 10) {
                    System.out.println("Pagamento até 10 dias de atrasado, valor em " + vezes + " vezes de " + valor);
                }

                if (pagamento - vencimento > 10) {
                    int diasAtraso = pagamento - vencimento - 10;
                    valor = valor + (diasAtraso * (valor * 0.02));
                    System.out.println("Pagamento com " + (diasAtraso + 10) + " dias de atraso, valor em " + vezes + " vezes de " + valor);
                }

                break;

            default:
                System.out.println("Erro");
                break;
        }
        teclado.close();
    }
}