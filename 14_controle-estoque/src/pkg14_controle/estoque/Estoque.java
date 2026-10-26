/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_controle.estoque;
import java.util.Scanner;
/**
 *
 * @author giraw
 */
public class Estoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int estoque;
        int recusadas = 0;
        int opcao;
        int adicionar;
        int retirar;
        do {
            System.out.print("Quantidade inicial de cadernos: ");
            estoque = sc.nextInt();
            if (estoque < 0) {
                System.out.println("Quantidade invalida! Digite novamente.");
            }
        } while (estoque < 0);

        do {
            System.out.println("1 - Adicionar unidades");
            System.out.println("2 - Retirar unidades");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade a adicionar: ");
                     adicionar = sc.nextInt();

                    if (adicionar <= 0) {
                        System.out.println("Quantidade invalida!");
                    } else {
                        estoque += adicionar;
                        System.out.println("Saldo atual: " + estoque);
                    }
                    break;
                case 2:
                    System.out.print("Quantidade a retirar: ");
                     retirar = sc.nextInt();

                    if (retirar <= 0) {
                        System.out.println("Quantidade invalida!");
                    } else if (retirar > estoque) {
                        System.out.println("Retirada recusada: estoque insuficiente.");
                        recusadas++;
                    } else {
                        estoque -= retirar;
                        System.out.println("Saldo atual: " + estoque);
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        System.out.println("Saldo final: " + estoque);
        System.out.println("Retiradas recusadas por falta de itens: " + recusadas);
        // TODO code application logic here
    }
    
}
