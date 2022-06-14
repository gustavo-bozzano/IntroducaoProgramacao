import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double renda = teclado.nextDouble();
        int dependentes = teclado.nextInt();
        teclado.close();
        double imposto;

        if (renda > 2000 && renda < 5000) {
            imposto = (renda * 0.05) - (dependentes * 0.02);
            System.out.println(imposto);
        } else if (renda >= 5000 && renda <= 10000) {
            imposto = (renda * 0.1) - (dependentes * 0.02);
            System.out.println(imposto);
        } else if (renda > 10000) {
            imposto = (renda * 0.15) - (dependentes * 0.02);
            System.out.println(imposto);
        } else {
            System.out.println("Pobre, n paga imposto");
        }
    }
}