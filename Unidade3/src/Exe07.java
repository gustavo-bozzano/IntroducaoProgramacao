import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int lata350 = teclado.nextInt() * 350;
        int garrafa600 = teclado.nextInt() * 600;
        int garrafao2k = teclado.nextInt() * 2000;

        System.out.println(lata350 + garrafa600 + garrafao2k);

        teclado.close();
    }
}
