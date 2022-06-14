import java.util.Scanner;
//consertado
public class Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int entrada1 = teclado.nextInt();
        int entrada2 = teclado.nextInt();
        teclado.close();

        if ((entrada1 % entrada2) == 0) {
            System.out.println("Multiplos");
        } else {
            System.out.println("N multiplos");
        }
    }
}
