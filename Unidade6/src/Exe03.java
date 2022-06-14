import java.util.Scanner;

public class Exe03 {
    // Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de
    // 12 posições do tipo real. Em seguida, modifique o vetor de modo que os
    // valores das posições ímpares sejam aumentados em 5% e os das posições pares
    // sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler
    // os valores, outro para ajustar os valores dentro do vetor e outro para
    // escrever os valores atualizados do vetor.
    private Exe03() {
        double vetor[] = new double[4]; // botei 4 dnv pra ficar mais curto

        lerValor(vetor);
        ajustaValor(vetor);
        imprimeValor(vetor);
    }

    private void lerValor(double vetor[]) {
        System.out.println("Insira 12 valores reais");
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextDouble();
        }
        teclado.close();
    }

    private void ajustaValor(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) { // par
                vetor[i] = vetor[i] + (vetor[i] * 0.02);
            } else { // impar
                vetor[i] = vetor[i] + (vetor[i] * 0.05);
            }
        }
    }

    private void imprimeValor(double vetor[]) {
        System.out.print("Valores do vetor atualizados:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(" " + vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Exe03();
    }
}
