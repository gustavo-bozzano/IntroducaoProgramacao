import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1;
        int valor2;
        int opcao;

        System.out.println("1 - Soma de dois numeros.");
        System.out.println("2 - Diferenca entre dois numeros.");
        System.out.println("3 - Produto entre dois numeros.");
        System.out.println("4 - Divisao entre dois numeros (o denominador nao pode ser zero).");

        System.out.println("Informe a opcao");
        opcao = teclado.nextInt();
        System.out.println("Informe o valor 1");
        valor1 = teclado.nextInt();
        System.out.println("Informe o valor 2");
        valor2 = teclado.nextInt();
        teclado.close();

        switch (opcao) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(valor1 - valor2);
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                if (valor2 != 0) {
                    System.out.println(valor1 / valor2);
                    break;
                }
            default:
                System.out.println("Erro");
                break;
        }
    }
}
