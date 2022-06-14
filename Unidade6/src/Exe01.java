import java.util.Scanner;

public class Exe01 {
    private Exe01() {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[10];
        vetorLer(teclado, vetor);
        vetorEscrever(vetor);
        teclado.close();
    }

    // ler vetor
    private void vetorLer(Scanner teclado, int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor de I " + i);
            vetor[i] = teclado.nextInt();
        }
    }

    // escrever vetor
    private void vetorEscrever(int vetor[]) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Exe01();
    }
}