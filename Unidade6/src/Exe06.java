import java.util.Scanner;

public class Exe06 {
    // Faça um programa que leia um valor N inteiro. Com base neste valor, crie um
    // vetor do tipo real. Em seguida, solicite ao usuário informar essa quantidade
    // N de valores reais para popular o vetor. Após ter preenchido o vetor,
    // solicite que o usuário informe um outro valor real. Informe para o usuário se
    // este valor informado se encontra cadastrado no vetor. Faça um método para ler
    // o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.
    private Exe06() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o N");
        int n = teclado.nextInt();
        int vetor1[] = new int[n];

        lerVetor(vetor1, teclado);
    }

    private void lerVetor(int vetor1[], Scanner teclado) {
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Informe um valor: ");
            vetor1[i] = teclado.nextInt();
        }

        System.out.println("Informe um valor a ser pesquisado");
        int valor = teclado.nextInt();
        teclado.close();
        pesquisaVetor(valor, vetor1);
    }

    private void pesquisaVetor(int valor, int vetor1[]) {
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == valor) {
                System.out.println("Valor existe no array, indice: " + i);
            }
        }
    }

    public static void main(String[] args) {
        new Exe06();
    }
}
