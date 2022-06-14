public class CaixaAreia {
    private CaixaAreia() { // construtor
        Teste();
    }

    private void Teste() { // void = sem saida
        System.out.println("Teste");
        Teste1();
    }

    private int Teste1() { // com saida
        return 2;
    }

    public static void main(String[] args) {
        new CaixaAreia();
    }
}
