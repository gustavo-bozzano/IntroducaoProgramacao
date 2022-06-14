import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Infome numero da inscricao");
        int inscricao = teclado.nextInt();

        int alturaMaior = 0;
        int inscricaoMaior = 0;
        int alturaMenor = 0;
        int inscricaoMenor = 50000;
        int acumuladorAltura = 0;
        int acumuladorInscricao = 0;
        while (inscricao != 0) {

            System.out.println("Infome altura");
            int altura = teclado.nextInt();

            if (altura > alturaMaior) {
                alturaMaior = altura;
                inscricaoMaior = inscricao;
            }
            if (altura < alturaMenor) {
                alturaMenor = altura;
                inscricaoMenor = inscricao;
            }
            acumuladorInscricao++;
            acumuladorAltura += altura;

            System.out.println("Informe inscricao");
            inscricao = teclado.nextInt();
        }
        System.out.println("Inscricao e altura do maior: " + inscricaoMaior + ", " + alturaMaior);
        System.out.println("Inscricao e altura do menor: " + inscricaoMenor + ", " + alturaMenor);

        int media = acumuladorAltura / acumuladorInscricao;
        System.out.println("Media das alturas: " + media);
        teclado.close();
    }
}