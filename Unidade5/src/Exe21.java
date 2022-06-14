public class Exe21 {
    public static void main(String[] args) {
        double chico = 1.50;
        double ze = 1.10;
        int chicoZe = 0;
        
        while (chico > ze) {
            chicoZe++;
            chico += 0.20;
            ze += 0.30;
        }
        System.out.println(chicoZe + " anos para que o Ze seja maior que Chico");
    }
}
