import java.util.Scanner;

public class GustavoCelsoBozzano_2 {
    private GustavoCelsoBozzano_2() {
        System.out.println("Informe o tamanho do vetor: ");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        System.out.println("Tamanho do vetor: " + n);
        int vetor1[] = new int[n];
        int vetor2[] = new int[n];
        int vetor3[] = new int[n];

        lerVetor(teclado, vetor1, vetor2);
        somaVetor(vetor1, vetor2, vetor3);
        ordernaVetor(vetor3);
        escreveVetor(vetor3);
    }

    private void lerVetor(Scanner teclado, int vetor1[], int vetor2[]) {
        System.out.println("__Lendo vetor A__");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("VetA[" + i + "]: ");
            vetor1[i] = teclado.nextInt();
        }
        System.out.println("__Lendo vetor B__");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("VetB[" + i + "]: ");
            vetor2[i] = teclado.nextInt();
        }
        teclado.close();
    }

    private void somaVetor(int vetor1[], int vetor2[], int vetor3[]) {
        int i = vetor3.length - 1;
        for (int j = 0; j < vetor3.length; j++) {
            vetor3[j] = vetor1[j] + vetor2[i];
            i--;
        }
    }

    private void ordernaVetor(int vetor3[]) {
        int i = 0;
        int bolha;
        do {
            if (vetor3[i] > vetor3[i + 1]) {
                bolha = vetor3[i];
                vetor3[i] = vetor3[i + 1];
                vetor3[i + 1] = bolha;
                i = 0;
            } else {
                i = i + 1;
            }
        } while (i < vetor3.length - 1);
        System.out.println("Valores ordenados");
    }

    private void escreveVetor(int vetor3[]) {
        System.out.println("__Resultado__");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("VetSoma[" + i + "]: " + vetor3[i]);
        }
    }

    public static void main(String[] args) {
        new GustavoCelsoBozzano_2();
    }
}