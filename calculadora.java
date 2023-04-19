//package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op;
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escolha uma das opções do MENU");
            System.out.println("\n =========================");
            System.out.println(" | + => Soma |");
            System.out.println(" | - => Subtração |");
            System.out.println(" | * => Multiplicação|");
            System.out.println(" | / => Divisão |");
            System.out.println(" | ------------- |");
            System.out.println(" | 0 - Sair |");
            System.out.println(" =========================\n");
            op = entrada.next().charAt(0);
            switch (op) {
                case '+':
                case '-':
                case '*':
                case '/':
                    if (op != '0') {
                        System.out.println("Informe o primeiro valor: ");
                        n1 = entrada.nextDouble();
                        System.out.println("Informe o segundo valor: ");
                        n2 = entrada.nextDouble();
                        switch (op) {
                            case '+':
                                System.out.println("======= SOMA ======");
                                System.out.print("Resultado = " + (n1 + n2));
                                System.out.print("\n");
                                break;
                            case '-':
                                System.out.println("======= SUBTRAÇÃO ======");
                                System.out.print("Resultado = " + (n1 - n2));
                                System.out.print("\n");
                                break;
                            case '*':
                                System.out.println("======= MULTIPLICAÇÃO ======");
                                System.out.print("Resultado = " + (n1 * n2));
                                System.out.print("\n");
                                break;
                            case '/':
                                System.out.println("======= DIVISÃO ======");
                                System.out.print("Resultado = " + (n1 / n2));
                                System.out.print("\n");
                                break;
                            default:
                        }
                    }
                    break;

                default:
                    if (op != '0') {
                        System.out.println("OPERAÇÃO INVÁLIDA!!!");
                    }
                    break;
            }
        } while ('0' != op);
        System.out.println("PROGRAMA FINALIZADO COM SUCESSO!!!");
    }
}