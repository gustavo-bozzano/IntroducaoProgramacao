import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horasCheg;
        double minutosCheg;
        int horasPart;
        double minutosPart;
        double valorPagar = 0;
        int horaTotal;
        double minTot;

        System.out.println("Informe as horas de chegada");
        horasCheg = teclado.nextInt();
        System.out.println("Informe os minutos de chegada");
        minutosCheg = teclado.nextDouble();
        System.out.println("Informe as horas de partida");
        horasPart = teclado.nextInt();
        System.out.println("Informe os minutos de partida");
        minutosPart = teclado.nextDouble();
        teclado.close();

        if (horasCheg > horasPart) {
            horasPart = horasPart + 24;
        }
        if (minutosCheg > minutosPart) {
            minutosPart = minutosPart + 60;
            horasPart = horasPart + 1;
        }

        horaTotal = horasPart - horasCheg;
        System.out.println("O numero total de horas eh " + horaTotal);
        minTot = minutosPart - minutosCheg;
        System.out.println("O numero total de minutos eh " + minTot);

        if (minTot >= 30 && minTot < 60) {
            horaTotal = horaTotal + 1;
        }
        if (horaTotal < 24) {
          
            switch (horaTotal) {
                case 0:
                    valorPagar = 5;
                    break;
                case 1:
                    valorPagar = 5;
                    break;
                case 2:
                    valorPagar = 5 + 5;
                    break;
                case 3:
                    valorPagar = 5 + 5 + 7.5;
                    break;
                case 4:
                    valorPagar = 5 + 5 + 7.5 + 7.5;
                    break;
                default:
                    valorPagar = 5 + 5 + 7.5 + 7.5 + (10 * (horaTotal - 4));
                    break;
            }
            System.out.println("O valor a ser pago eh " + valorPagar);
        } else {
            System.out.println("Hora/Minuto incorretas");
        }
    }
}