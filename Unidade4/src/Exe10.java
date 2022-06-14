import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int marquinhos = teclado.nextInt();
        int zezinho = teclado.nextInt();
        int luluzinha = teclado.nextInt();
        teclado.close();

        if (marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("Marquinhos cacula");
        }
        if (zezinho < marquinhos && zezinho < luluzinha) {
            System.out.println("Zezinho cacula");
        }
        if (luluzinha < zezinho && luluzinha < marquinhos) {
            System.out.println("Luluzinha cacula");
        }
    }
}