import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        int centena = numero / 100;
        int deze = (numero % 100);
        int unidade = deze % 10;
        int dezena = deze / 10;

        System.out.println(centena);
        System.out.println(dezena);
        System.out.println(unidade);

        teclado.close();
    }
}