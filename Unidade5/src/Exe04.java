public class Exe04 {
    public static void main(String[] args) {
        double s = 0;
        double total = 0;
        double numerador = 3;
        double denominador = 2;
        double par = 4;
        for (int i = 0; i < 20; i++) {
            s = numerador / denominador;
            total += s;
            numerador += 2;
            denominador += par;
            par += 2;
        }
        System.out.println(total);
    }
}