public class Bolha {
    public static void main(String[] args) {
        int vetor[] = new int[3];
        bolha(vetor);
        bolhaInverso(vetor);
    }

    public static void bolha(int vetor[]) {
        int bolha;
        int i = 0;
        vetor[0] = 22; // remover
        vetor[1] = 20; // remover
        vetor[2] = 44; // remover

        do {
            if (vetor[i] > vetor[i + 1]) {
                bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = 0;
            } else {
                i = i + 1;
            }
        } while (i < vetor.length - 1);

        for (int j = 0; j < vetor.length; j++) { // pra printar
            System.out.println(vetor[j]);
        }
        System.out.println("//////");
    }

    public static void bolhaInverso(int vetor[]) {
        int i = 0;
        vetor[0] = 22; // remover
        vetor[1] = 20; // remover
        vetor[2] = 44; // remover

        for (i = 1; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] > vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        for (int j = 0; j < vetor.length; j++) { // pra printar
            System.out.println(vetor[j]);
        }
    }
}
