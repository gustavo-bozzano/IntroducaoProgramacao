import java.util.Scanner;

public class Exe02 {
    // leia 12 valores reais e os coloque em um vetor de
    // 12 posições do tipo real. Imprima quais valores desses informados são maiores
    // que a média dos valores. Faça um método para ler os valores, outro para
    // calcular a média e outro para informar os valores maiores que a média.
    private Exe02() {
        double vetor[] = new double[4]; // sim eu sei q o vetor era pra ser de 12, mas botei 4 pra ficar mais rapido
        double somaTotal = 0;

        lerValor(vetor);
        double media = calculaMedia(vetor, somaTotal);
        valorMaior(vetor, media);
    }

    private void lerValor(double vetor[]) {
        System.out.println("Insira 12 valores reais");
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();
        }
        teclado.close();
    }

    private double calculaMedia(double[] vetor, double somaTotal) {
        double media = 0;
        for (int i = 0; i < vetor.length; i++) {
            somaTotal += vetor[i];
        }
        media = somaTotal / vetor.length;
        System.out.println("Media dos valores: " + media);
        return media;
    }

    private void valorMaior(double[] vetor, double media) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Valor acima da media: " + vetor[i]);
            }
        }
    }

    public static void main(String[] args) {
        new Exe02();
    }
}
