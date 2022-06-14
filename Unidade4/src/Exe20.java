import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaProva1 = teclado.nextDouble();
        double notaProva2 = teclado.nextDouble();
        double notaProva3 = teclado.nextDouble();
        double notaExer = teclado.nextDouble();
        double media = (notaProva1 + (notaProva2 * 2) + (notaProva3 * 3) + notaExer) / 7;
        teclado.close();
        System.out.println(media);

        if (media >= 9) {
            System.out.println("A");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("B");
        } else if (media >= 6 && media < 7) {
            System.out.println("C");
        } else if (media >= 4 && media < 6) {
            System.out.println("C");
        } else {
            System.out.println("E");
        }
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}