import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha uma opcao: ");
        System.out.println("T: calcular area de um triangulo base b e altura h");
        System.out.println("Q: calcular area de um quadrado de lado l");
        System.out.println("R: calcular area de um retangulo de base b e altura");
        System.out.println("C: calcular area de um circulo de raio r");
        char entrada = teclado.next().charAt(0);

        double b;
        double h;

        switch (entrada) {
            case 'T':
                System.out.println("Digite a base e altura do triangulo");
                b = teclado.nextDouble();
                h = teclado.nextDouble();
                System.out.println("Area do triangulo = " + (b * h) / 2);
                break;

            case 'Q':
                System.out.println("Digite o lado");
                double lado = teclado.nextDouble();
                System.out.println("Area do quadrado = " + lado * lado);
                break;

            case 'R':
                System.out.println("Digite a base e altura do retangulo");
                b = teclado.nextDouble();
                h = teclado.nextDouble();
                System.out.println("Area do retangulo = " + b * h);
                break;

            case 'C':
                System.out.println("Digite o raio");
                double r = teclado.nextDouble();
                System.out.println("Area do circulo = " + Math.PI * Math.pow(r, 2));
                break;
            default:
                break;
        }
        teclado.close();
    }
}