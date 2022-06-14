import java.util.Scanner;

//ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
public class Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();

        System.out.println("Media ponderada: " + ((nota1 * 0.5) + (nota2 * 0.3) + (nota3 * 0.2)));

        teclado.close();
    }
}
