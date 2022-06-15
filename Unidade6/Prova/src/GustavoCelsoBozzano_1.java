import java.util.Scanner;

public class GustavoCelsoBozzano_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diarias;
        int opcao = 0;
        double total;
        String nomeHospede;
        int contasEncerradas = 0;
        do {
            System.out.println(
                    "____ Controle de hospedes ____ \n 1. encerrar a conta de um hospede \n 2. verificar o numero de contas encerradas \n 3. sair");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do hóspede: ");
                    nomeHospede = teclado.next();
                    System.out.println("Informe o número de diárias: ");
                    diarias = teclado.nextInt();
                    if (diarias < 7) {
                        total = (diarias * 10) + 7.3;
                        System.out.println("------\nNome: " + nomeHospede + "\nTotal: " + total);
                        contasEncerradas++;
                        break;
                    }
                    if (diarias == 7) {
                        total = (diarias * 10) + 6.3;
                        System.out.println("------\nNome: " + nomeHospede + "\nTotal: " + total);
                        contasEncerradas++;
                        break;
                    }
                    if (diarias > 7) {
                        total = (diarias * 10) + 5.3;
                        System.out.println("------\nNome: " + nomeHospede + "\nTotal: " + total);
                        contasEncerradas++;
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Total de contas encerradas: " + contasEncerradas);
                    break;
                default:
                    if (opcao != 3) {
                        System.out.println("Opcao incorreta, digite novamente");
                    }
            }
        } while (opcao != 3);
        teclado.close();
    }
}
