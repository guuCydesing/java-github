/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05.caixa.de.uma.lanchonete;
 import java.util.Scanner;
/**
 *
 * @author giraw
 */
public class CaixaDeUmaLanchonete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        double total = 0;
        int opcao;
        double preco;
        int qtd;
        do {
            System.out.println("1 - Sanduíche (R$ 15,00)");
            System.out.println("2 - Suco (R$ 7,00)");
            System.out.println("3 - Água (R$ 4,00)");
            System.out.println("4 - Finalizar compra");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                    
                    if (opcao == 1) {
                        preco = 15.00;
                    } else if (opcao == 2) {
                        preco = 7.00;
                    } else {
                        preco = 4.00;
                    }

                    System.out.print("Quantidade: ");
                     qtd = sc.nextInt();

                    if (qtd <= 0) {
                        System.out.println("Quantidade invalida! Pedido não aceito.");
                    } else {
                        total += preco * qtd;
                        System.out.println("Item adicionado.");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 4);

        System.out.printf("\n"+"Total da compra: R$ "+ total);

        if (total > 50) {
            double desconto = total * 0.05;
            System.out.printf("Desconto de 5% : R$ "+ desconto);
            System.out.printf("Total a pagar: R$ "+ (total - desconto));
        } else {
            System.out.println("Sem desconto.");
        }
        // TODO code application logic here
    }
    
}
