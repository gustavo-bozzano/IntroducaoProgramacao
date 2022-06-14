import java.util.Scanner;

public class Exe04 {
    // Faça um programa para ler os valores de dois vetores de inteiros, cada um
    // contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma
    // dos valores contidos nas posições respectivas dos vetores originais. Por
    // exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final,
    // os três vetores na tela. Faça três métodos: um método para ler valores dos
    // vetores, outro para somar e outro para escrever os vetores.
    private Exe04() {
        int vetor1[] = new int[3]; // utilizei 3 pra simplificar
        int vetor2[] = new int[3]; // utilizei 3 pra simplificar
        int vetor3[] = new int[3]; // utilizei 3 pra simplificar

        lerValor(vetor1, vetor2);
        somaValor(vetor1, vetor2, vetor3);
        imprimeValor(vetor3);
    }

    private void lerValor(int vetor1[], int vetor2[]) {
        System.out.println("Insira 10 valores inteiros do primeiro vetor");
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = teclado.nextInt();
        }
        System.out.println("Insira 10 valores inteiros do segundo vetor");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = teclado.nextInt();
        }
        teclado.close();
    }

    private void somaValor(int vetor1[], int vetor2[], int vetor3[]) {
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    private void imprimeValor(int vetor3[]) {
        System.out.print("Valores dos vetores somados:");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(" " + vetor3[i]);
        }
    }

    public static void main(String[] args) {
        new Exe04();
    }
}
