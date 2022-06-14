import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma;
        int multipli;
        int homem1 = teclado.nextInt();
        int homem2 = teclado.nextInt();
        int mulher1 = teclado.nextInt();
        int mulher2 = teclado.nextInt();
        teclado.close();

        if (homem1 > homem2 && mulher1 > mulher2) {
            soma = homem1 + mulher2;
            multipli = homem2 * mulher1;
        } else if (homem1 > homem2 && mulher2 > mulher1) {
            soma = homem1 + mulher1;
            multipli = homem2 * mulher2;
        }
        else if (homem2 > homem1 && mulher1 > mulher2) {
            soma = homem2 + mulher2;
            multipli = homem1 * mulher1;
        }
        else {
            soma = homem2 + mulher1;
            multipli = homem1 * mulher1;
        }
        System.out.println(soma);
        System.out.println(multipli);
    }
}