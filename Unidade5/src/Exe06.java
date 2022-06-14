import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite sua altura: ");
            altura = teclado.nextInt();
            contador += altura;
        }
        double mediaAltura = contador / 20;
        System.out.println(mediaAltura);
        teclado.close();
    }
}
