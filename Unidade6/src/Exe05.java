import java.util.Scanner;

public class Exe05 {
    // Gosta de música sertaneja?Gosta de futebol?Gosta de seriados?Gosta de redes
    // sociais?Gosta da Oktoberfest?A resposta a cada pergunta pode ser: SIM, NÃO ou
    // IND (indiferente). O índice de afinidade é medido da seguinte maneira:se
    // ambos deram a mesma resposta soma-se 3 pontos ao índice;se um respondeu IND e
    // o outro SIM ou NÃO soma-se 1;se um respondeu SIM e o outro NÃO subtrai-se 2
    // ao índice.Crie um vetor para armazenar as respostas do rapaz e outro para
    // armazenar as respostas da moça. Crie um método que possa ler tanto as
    // respostas do rapaz como da moça, e outro para calcular e retornar a
    // afinidade. Por fim, escreva a afinidade considerando os seguintes intervalos:
    private Exe05() {
        int afinidade = 0;
        String vetor1[] = new String[5];
        String vetor2[] = new String[5];

        lerValor(vetor1, vetor2);
        calculaVetor(vetor1, vetor2, afinidade);
    }

    private void lerValor(String vetor1[], String vetor2[]) {
        System.out.println("Respostas aceitas: sim, nao e ind");
        Scanner teclado = new Scanner(System.in);

        // rapaz
        System.out.println("Gosta de música sertaneja?");
        vetor1[0] = teclado.next();

        System.out.println("Gosta de futebol?");
        vetor1[1] = teclado.next();

        System.out.println("Gosta de seriados?");
        vetor1[2] = teclado.next();

        System.out.println("Gosta de redes sociais?");
        vetor1[3] = teclado.next();

        System.out.println("Gosta de oktoberfest?");
        vetor1[4] = teclado.next();

        // moca
        System.out.println("Agora é a moca que responde");
        System.out.println("Gosta de música sertaneja?");
        vetor2[0] = teclado.next();

        System.out.println("Gosta de futebol?");
        vetor2[1] = teclado.next();

        System.out.println("Gosta de seriados?");
        vetor2[2] = teclado.next();

        System.out.println("Gosta de redes sociais?");
        vetor2[3] = teclado.next();

        System.out.println("Gosta de oktoberfest?");
        vetor2[4] = teclado.next();

        teclado.close();
    }

    private void calculaVetor(String vetor1[], String vetor2[], int afinidade) {

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i].equals(vetor2[i])) {
                afinidade += 3;
            } else if (!vetor1[i].equals(vetor2[i]) && vetor1[i].equals("ind")) {
                afinidade += 1;
            } else if (!vetor1[i].equals(vetor2[i]) && vetor2[i].equals("ind")) {
                afinidade += 1;
            } else if (!vetor1[i].equals(vetor2[i])) {
                afinidade -= 3;
            }
        }
        if (afinidade == 15) {
            System.out.println("CASEM!!!!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vai dar bom");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Vale um encontro");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Talvez não de certo, talvez da");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade <= -10) {
            System.out.println("Voces se odeiam!!");
        }
    }

    public static void main(String[] args) {
        new Exe05();
    }
}
