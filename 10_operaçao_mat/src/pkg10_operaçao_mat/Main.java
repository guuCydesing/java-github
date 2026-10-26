/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg10_operaçao_mat;
 import java.util.Scanner;
/**
 *
 * @author giraw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
        boolean continuar = true;
        int opcao;
        double a;
        double b;
        int R;
 
        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Encerrar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
 
            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.print("Primeiro numero: ");
                    a = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    b = sc.nextDouble();
 
                    if (opcao == 1) {
                        System.out.println("Resultado: " + (a + b));
                    } else if (opcao == 2) {
                        System.out.println("Resultado: " + (a - b));
                    } else if (opcao == 3) {
                        System.out.println("Resultado: " + (a * b));
                    } else {
                        if (b == 0) {
                            System.out.println("Não é possível dividir por zero.");
                        } else {
                            System.out.println("Resultado: " + (a / b));
                        }
                    }
 
                   
                    do {
                        System.out.print("Deseja realizar outra operação? Se sim digite 1, se não digite 2: ");
                        R = sc.nextInt();
                        if (R != 1 && R != 2) {
                            System.out.println("Opção inválida!");
                        }
                    } while (R != 1 && R != 2);
 
                    if (R == 2) {
                        continuar = false;
                    }
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inexistente! Tente novamente.");
            }
        } while (continuar);
 
        System.out.println("Aplicativo encerrado.");
        // TODO code application logic here
    }
    
}
