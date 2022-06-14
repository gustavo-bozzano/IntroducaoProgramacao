import java.util.Scanner;

public class Uri1007 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        int diferenca = (A * B) - (C * D);
        System.out.println("DIFERENCA = " + (diferenca));

        teclado.close();
    }
}
