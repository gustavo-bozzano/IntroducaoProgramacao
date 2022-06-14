import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int valor1;
        int valor2;
        int valor3;

        System.out.println("Informe a opcao");
        opcao = teclado.nextInt();
        System.out.println("Informe o valor 1");
        valor1 = teclado.nextInt();
        System.out.println("Informe o valor 2");
        valor2 = teclado.nextInt();
        System.out.println("Informe o valor 3");
        valor3 = teclado.nextInt();
        teclado.close();

        switch (opcao) {
            case 1:
                if (valor1 < valor2 && valor1 < valor3 && valor2 < valor3) {
                    System.out.println(valor1);
                    System.out.println(valor2);
                    System.out.println(valor3);
                } else {
                    if (valor1 < valor2 && valor1 < valor3 && valor2 > valor3) {
                        System.out.println(valor1);
                        System.out.println(valor3);
                        System.out.println(valor2);
                    } else {
                        if (valor1 > valor2 && valor1 < valor3 && valor2 < valor3) {
                            System.out.println(valor2);
                            System.out.println(valor1);
                            System.out.println(valor3);
                        } else {
                            if (valor1 > valor2 && valor1 > valor3 && valor2 < valor3) {
                                System.out.println(valor2);
                                System.out.println(valor3);
                                System.out.println(valor1);
                            } else {
                                if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                                    System.out.println(valor3);
                                    System.out.println(valor2);
                                    System.out.println(valor1);
                                } else {
                                    if (valor1 < valor2 && valor1 > valor3 && valor2 > valor3) {
                                        System.out.println(valor3);
                                        System.out.println(valor1);
                                        System.out.println(valor2);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                    System.out.println(valor1);
                    System.out.println(valor2);
                    System.out.println(valor3);
                } else {
                    if (valor1 > valor2 && valor1 > valor3 && valor2 < valor3) {
                        System.out.println(valor1);
                        System.out.println(valor3);
                        System.out.println(valor2);
                    } else {
                        if (valor1 < valor2 && valor1 > valor3 && valor2 > valor3) {
                            System.out.println(valor2);
                            System.out.println(valor1);
                            System.out.println(valor3);
                        } else {
                            if (valor1 < valor2 && valor1 < valor3 && valor2 > valor3) {
                                System.out.println(valor2);
                                System.out.println(valor3);
                                System.out.println(valor1);
                            } else {
                                if (valor1 < valor2 && valor1 < valor3 && valor2 < valor3) {
                                    System.out.println(valor3);
                                    System.out.println(valor2);
                                    System.out.println(valor1);
                                } else {
                                    if (valor1 > valor2 && valor1 < valor3 && valor2 < valor3) {
                                        System.out.println(valor3);
                                        System.out.println(valor1);
                                        System.out.println(valor2);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                if (valor1 < valor2 && valor1 < valor3 && valor2 < valor3) {
                    System.out.println(valor1);
                    System.out.println(valor3);
                    System.out.println(valor2);
                } else {
                    if (valor1 < valor2 && valor1 < valor3 && valor2 > valor3) {
                        System.out.println(valor1);
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else {
                        if (valor1 > valor2 && valor1 < valor3 && valor2 < valor3) {
                            System.out.println(valor2);
                            System.out.println(valor3);
                            System.out.println(valor1);
                        } else {
                            if (valor1 > valor2 && valor1 > valor3 && valor2 < valor3) {
                                System.out.println(valor2);
                                System.out.println(valor1);
                                System.out.println(valor3);
                            } else {
                                if (valor1 > valor2 && valor1 > valor3 && valor2 > valor3) {
                                    System.out.println(valor3);
                                    System.out.println(valor1);
                                    System.out.println(valor2);
                                } else {
                                    if (valor1 < valor2 && valor1 > valor3 && valor2 > valor3) {
                                        System.out.println(valor3);
                                        System.out.println(valor2);
                                        System.out.println(valor1);
                                    }
                                }
                            }
                        }
                    }
                }
        }
    }
}