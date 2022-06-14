public class Questao1 {
    public static void main(String[] args) throws Exception {
        String nivel = "alto";
        String altura = "certa";

        if (nivel == null && altura == null) {
            System.out.println("Nivel e Altura");

        } else {
            System.out.println("Teste altura");
            if (altura == null) {
                System.out.println("Altura vazio");
                System.out.println("Nivel vazio");
            } else {
                System.out.println("Altura cadastrada");
            }
        }
        System.out.println("Outro nivel");
    }
}