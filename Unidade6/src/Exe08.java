import java.util.Scanner;

public class Exe08 {
    private Exe08() {
        // Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base
        // neste valor, crie um vetor do tipo real. Faça o usuário informar valores para
        // as posições deste vetor e coloque-as nas posições na sequência informada pelo
        // usuário. Imprima uma tabela contendo cada valor diferente e o número de vezes
        // que o valor aparece no vetor
        Scanner teclado = new Scanner(System.in);
        int n;
        int freq;
        do {
            System.out.println("Informe o valor N (limitado a 20)");
            n = teclado.nextInt();
        } while (n < 1 || n > 20);

        double vetor1[] = new double[n];

        lerVetor(teclado, vetor1);
        teclado.close();
        compara(vetor1);
        imprimeVetor(vetor1);
    }

    private void lerVetor(Scanner teclado, double vetor1[]) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe numero");
            vetor1[i] = teclado.nextDouble();
        }
    }

    private void compara(double vetor1[]) {

    }

    private void imprimeVetor(double vetor1[]) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i] + " | Frequencia: ");
        }
    }

    public static void main(String[] args) {
        new Exe08();
    }
}
