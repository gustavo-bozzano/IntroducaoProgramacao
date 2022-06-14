import java.util.Scanner;

public class Uri1004 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();

        System.out.println("PROD = " + (A * B));

        teclado.close();

    }
}