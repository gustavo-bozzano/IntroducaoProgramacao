public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

/*import java.util.Scanner;
public class Exe34 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int contContasEncerradas = 0;
        int cadastrarHospede;
        float totalAPagar;
        do {
            System.out.println("Escolha a sua opção.\nCaso deseje encerrar a conta"
            + " de um hóspede, digite 1."
            + "\nCaso deseje verificar o número de contas encerradas, digite 2."
            + "\nCaso deseje sair do sistema de cadastramentos, digite 3.");
            cadastrarHospede = scanner.nextInt();
            switch (cadastrarHospede) {
                case 1:
                System.out.println("Entre com o nome do hóspede: ");
                String nome = scanner.next();
                System.out.println("Informe o número de diárias dos hóspede: ");
                int diarias = scanner.nextInt();
                totalAPagar = (diarias < 15) ? ((7.50f * diarias) + 50.00f) : (diarias > 15) ?
                ((5.00f * diarias) + 50.00f) : ((6.50f * diarias) + 50.00f);
                // ? = if, : = else
                System.out.println("O total que " + nome + " deverá pagar é de R$ " + totalAPagar);
                contContasEncerradas += 1;
                break;
                case 2:
                System.out.println(contContasEncerradas + " hóspedes deixaram o hotel.");
                break;
            }
        } while (cadastrarHospede != 3);
        scanner.close();
    }
}
*/