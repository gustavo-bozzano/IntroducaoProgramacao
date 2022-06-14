import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o w");
        int z = teclado.nextInt();
        int a, b;
        int c = 1;
        teclado.close();

        for (a = 1; a <= z; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
