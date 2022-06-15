import java.util.Scanner;

public class Exe09 {


    private Exe09() {
        Scanner teclado = new Scanner(System.in);
        int vetorTamanho;
        do {
            System.out.println("Informe o tamanho do vetor entre 1 a 30");
            vetorTamanho = teclado.nextInt();
        } while ((vetorTamanho < 1) || (vetorTamanho > 30));
        int vetor[] = new int[vetorTamanho];
        String sexo[] = new String[vetorTamanho];
        int notaCinema[] = new int[vetorTamanho];
        int idade[] = new int[vetorTamanho];
        double mediaCinema = 0;
        vetorLer(teclado, vetor, sexo, notaCinema, idade);
        mediaCinema = vetorMediaCinema(vetor, notaCinema);
        vetorMediaHomens(vetor, sexo, notaCinema);
        vetorNotaMulherJovem(vetor, sexo, idade, notaCinema);
        vetorMulheres50(vetor, sexo, idade, notaCinema, mediaCinema);
        teclado.close();
    }

    private void vetorLer(Scanner teclado, int vetor[], String sexo[], int notaCinema[], int idade[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o sexo: ");
            sexo[i] = teclado.next();
            System.out.println("Informe uma nota para o cinema (um valor inteiro de 0 a 10 )");
            notaCinema[i] = teclado.nextInt();
            System.out.println("Informe a idade: ");
            idade[i] = teclado.nextInt();
        }
    }

    private double vetorMediaCinema(int vetor[], int notaCinema[]) {
        double somaCinema = 0, mediaCinema;
        for (int i = 0; i < vetor.length; i++) {
            somaCinema += notaCinema[i];
        }
        mediaCinema = somaCinema / vetor.length;
        System.out.println("A média do cinema é: " + mediaCinema);
        return mediaCinema;
    }

    private void vetorMediaHomens(int vetor[], String sexo[], int notaCinema[]) {
        double somaHomens = 0;
        double mediaHomens = 0;
        int masculino = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (sexo[i].equals("2")) {
                somaHomens += notaCinema[i];
                masculino++;
            }
        }
        mediaHomens = somaHomens / masculino;
        System.out.println("A média do cinema atribuída pelos homens é: " + mediaHomens);
    }

    private void vetorNotaMulherJovem(int vetor[], String sexo[], int idade[], int notaCinema[]) {
        int idadePesquisar;
        int idadeMulherJovem = idade[0];
        double notaMulherJovem = notaCinema[0];
        int feminino = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (sexo[i].equals("1")) {
                idadePesquisar = idade[i];
                if (idadeMulherJovem > idadePesquisar) {
                    idadeMulherJovem = idadePesquisar;
                    notaMulherJovem = notaCinema[i];
                }
                feminino++;
            }
        }
        if (feminino > 0) {
            System.out.println("A nota atribuída pela mulher mais jovem foi: " + notaMulherJovem);
        }
    }

    private void vetorMulheres50(int vetor[], String sexo[], int idade[], int notaCinema[], double mediaCinema) {
        int mulheres50 = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (sexo[i].equals("1") && idade[i] > 50 && notaCinema[i] > mediaCinema) {
                mulheres50++;
            }
        }
        if (mulheres50 > 0) {
            System.out.println(
                    "Mulheres acima de 50 q deram nota acima da media: " + mulheres50);
        }
    }

    public static void main(String[] args) {
        new Exe09();
    }
}