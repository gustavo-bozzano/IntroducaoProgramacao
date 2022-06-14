import java.util.Scanner;

/*Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas
 mensais e o número de dependentes. A empresa paga R$ 10,00 por hora (valor para cálculo do salário
  trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) e são feitos descontos
   de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de 
   renda. Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.
*/

public class Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        // String funcionario = teclado.nextLine(); dps q pronto tirar o /
        int horas = teclado.nextInt();
        int dependentes = teclado.nextInt();
        teclado.close();

        double porHora = 10 * horas;
        dependentes = dependentes * 60;
        double bruto = dependentes + porHora;

        System.out.println("Bruto: " + (bruto));

        double inss = porHora * 0.85;
        double ir = porHora *  0.5 ;
        double liquido = bruto - (ir + inss);

        System.out.println(liquido);
    }
}
