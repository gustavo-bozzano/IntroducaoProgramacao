import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.close();
        int numM = 4;
        int numS = 0;
        for (int i = 0; i < n; i++) {
            numM = numM * 2;
            numS = numM + 2;
            System.out.println(numM);
            System.out.println(numS);
        }
    }
}