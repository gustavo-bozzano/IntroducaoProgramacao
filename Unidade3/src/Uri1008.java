import java.util.Scanner;
import java.text.DecimalFormat;

//Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, 
//o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.

public class Uri1008 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        int numeroFunc;
        int horasTrabalhadas;
        double valorPorHora;

        numeroFunc = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorPorHora = teclado.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFunc);
        System.out.println("SALARY = U$ " + deci.format(salario));

        teclado.close();
    }
}