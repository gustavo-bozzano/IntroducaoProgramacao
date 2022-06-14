public class Exe03 {
    public static void main(String[] args) {
        double soma = 0;
        double numerador = 1;
        double denominador = 1;

        for (double i = 1; i <= 100; i++) {
            soma += numerador / denominador;
            denominador++;
        }
        System.out.println(soma);

        for (double i = 1; i <= 100; i++) {
            soma = 1 / i;
        }
        System.out.println(soma);
    }
}