import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int n, hora, minuto, segundo;

        n = teclado.nextInt();

        hora = n / 3600;
        n = n - (hora * 3600);

        minuto = n / 60;
        n = n - (minuto * 60);
        segundo = n;

        System.out.println(hora + ":" + minuto + ":" + segundo);
        teclado.close();
    }
}
