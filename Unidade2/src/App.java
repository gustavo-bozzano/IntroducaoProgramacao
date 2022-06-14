public class App {
    public static void main(String[] args) throws Exception {
        // Lista de exercicios

        // 1 e 2
        int a = 2;
        int b = 4;

        System.out.println("Soma de A + B = " + (a + b));
        System.out.println("Mutiplicacao de A e B = " + (a * b));

        // 3
        int raio = 4;
        double pi = 3.14159;

        System.out.println("Area da circurferencia = " + (pi * (raio * raio)));

        // 4
        int notaA = 10;
        int notaB = 8;

        double media = (notaA * 3.5 + notaB * 7.5) / 11;
        System.out.println("Media " + (media));

        // 5
        int A = 8;
        int B = 5;
        int C = 6;
        int D = 2;

        double diferenca = (A * B) - (C * D);
        System.out.println("Diferenca = " + (diferenca));

        // 6
        int funcionario = 69;
        int horas69 = 48;
        double salario69 = 1240.53;

        System.out.println(
                "Funcionario: " + (funcionario) + "\nHoras de trabalho: " + (horas69) + "\nSalario: " + (salario69));

        // 7
        double salarioRonaldo = 1100.00;
        double comissaoRonaldo = 700.00;

        double salarioTotalRonaldo = (salarioRonaldo) + (comissaoRonaldo * 15 / 100);
        System.out.println("Salario total do Ronaldo fenometro: " + (salarioTotalRonaldo));

        // 8
        int codPeca1 = 7821;
        int numPeca1 = 30;
        int valorPeca1 = 105;

        int codPeca2 = 2880;
        int numPeca2 = 5;
        int valorPeca2 = 220;

        int valorTotalPecas = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        System.out.println("Cod peca 1: " + (codPeca1) + " Cod peca 2: " + (codPeca2) + "\nO valor total das pecas eh: "
                + (valorTotalPecas) + " reais");

        // 9
        int valorEmDolares = 360;
        int valorEmReais = valorEmDolares * 5;

        System.out.println("Valor em R$ a receber: " + (valorEmReais) + " reais");

        // 10
        int eventoFabrica = 33;

        System.out.println("00:00:" + (eventoFabrica));

        // 11
        int medidaA = 10;
        int medidaB = 15;
        int medidaC = 5;

        int areaTriangulo = (medidaA * medidaC) / 2;
        System.out.println("Area do triangulo retangulo: " + (areaTriangulo));

        double areaCircuferencia1 = ((medidaC * medidaC) * pi);
        System.out.println("Area da circuferencia: " + (areaCircuferencia1));

        double areaTrapezio = (((medidaA + medidaB) * medidaC) / 2);
        System.out.println("Area do trapezio: " + (areaTrapezio));

        int areaQuadrado = medidaB * medidaB;
        System.out.println("Area do quadrado: " + (areaQuadrado));

        int areaRetangulo = medidaA * medidaB;
        System.out.println("Area do retangulo: " + (areaRetangulo));
    }
}
