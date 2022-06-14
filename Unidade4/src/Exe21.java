import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double massa = teclado.nextDouble();
        double altura = teclado.nextDouble();
        teclado.close();
        double imc = massa / Math.pow(altura, 2);
        System.out.println(imc);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Saudavel");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade grau 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }
    }
}
