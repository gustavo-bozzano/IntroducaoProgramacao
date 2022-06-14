import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) throws Exception {


        Scanner teclado = new Scanner(System.in);

        double terrenoLarg;
        double terrenoComp;

        System.out.println("Largura e comprimento: ");
        terrenoLarg = teclado.nextDouble();
        terrenoComp = teclado.nextDouble();

        double area = terrenoLarg * terrenoComp;
        System.out.println("Area: " + area);
        


        
        teclado.close();

    }
}