import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mes: ");
        int horasMes;
        horasMes = teclado.nextInt();

        System.out.println("Entre com o valor pago por hora: ");
        double horasValor;
        horasValor = teclado.nextDouble();

        teclado.close();

        double salarioTotal = horasMes * horasValor;

        if (horasMes > 160) {

            double salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;

        }

        System.out.println("O salario total eh: " + salarioTotal);

    }
}
