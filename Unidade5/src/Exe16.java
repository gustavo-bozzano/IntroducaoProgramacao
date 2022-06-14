import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("**ALTURA DEVE SER INFORMADA EM CM**");
        System.out.println("Infome altura");
        int altura = teclado.nextInt();
        int alturaHomem = 0;
        int contadorHomem = 0;
        int alturaMulher = 0;
        int contadorMulher = 0;

        while (altura != 0) {
            System.out.println("Informe sexo");
            char sexo = teclado.next().charAt(0);

            if (sexo == 'm' || sexo == 'M') {
                alturaHomem += altura;
                contadorHomem++;
            } else if (sexo == 'f' || sexo == 'F') {
                alturaMulher += altura;
                contadorMulher++;
            } else {
                System.out.println("Error");
            }

            System.out.println("Informe altura");
            altura = teclado.nextInt();
        }

        if (alturaHomem == 0 || alturaMulher == 0) {
            System.out.println("Erro com as alturas inseridas");
        } else {

            double mediaHomem = alturaHomem / contadorHomem;
            double mediaMulher = alturaMulher / contadorMulher;

            System.out.println("Media dos homens " + mediaHomem);
            System.out.println("Media das mulheres " + mediaMulher);
        }

        teclado.close();
    }
}
