import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int leitura = teclado.nextInt();
        teclado.close();

        switch (leitura) {
            case 1:
                System.out.println("Ciencia da Computacao");
                break;

            case 2:
                System.out.println("Licenciado em Computação");
                break;

            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;

            default:
                break;
        }
    }
}