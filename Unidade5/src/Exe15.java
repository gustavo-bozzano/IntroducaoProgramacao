import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Infome nome do aluno");
        String nomeAluno = teclado.next();
        double nota1;
        double nota2;

        while (!nomeAluno.equals("fim")) {
            System.out.println("Infome nota 1");
            nota1 = teclado.nextDouble();
            System.out.println("Infome nota 2");
            nota2 = teclado.nextDouble();

            double media = (nota1 + nota2) / 2;
            System.out.println(nomeAluno + " " + media);

            System.out.println("Infome nome do aluno");
            nomeAluno = teclado.next();
        }
        teclado.close();
    }
}
