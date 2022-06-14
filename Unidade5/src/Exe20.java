import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a massa em kg");
        double massaI = teclado.nextInt();
        teclado.close();

        massaI *= 1000;
        double massaF = massaI;
        int tempo = 0;

        while (massaF >= 0.5) {
            tempo += 50;
            massaF = massaF / 2;
        }

        System.out.println("Massa inicial: " + massaI + " quilos");
        System.out.println("Massa final: " + massaF + " gramas");
        System.out.println("Tempo: " + tempo + " segundos");
    }
}
