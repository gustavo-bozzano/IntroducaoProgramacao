public class Cadeado {
    public static void main(String[] args) {
        int senha1, senha2, senha3;
        for (senha3 = 0; senha3 < 10; senha3++) {
            for (senha2 = 0; senha2 < 10; senha2++) {
                for (senha1 = 0; senha1 < 10; senha1++) {
                    System.out.println(senha3 + " " + senha2 + " " + senha1);
                }
            }
        }
    }
}