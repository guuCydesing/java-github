/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg15_multiplos_tres;
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
        int inicio;
        int fim;
        int quantidade = 0;
        int soma = 0;
        
        System.out.print("Início do intervalo: ");
        inicio = sc.nextInt();
        System.out.print("Fim do intervalo: ");
        fim = sc.nextInt();

        while (inicio > fim) {
            System.out.println("O início deve ser menor ou igual ao fim. Digite novamente.");
            System.out.print("Início do intervalo: ");
            inicio = sc.nextInt();
            System.out.print("Fim do intervalo: ");
            fim = sc.nextInt();
        }

        System.out.println("Múltiplos de 3 no intervalo:");
        for (int i = inicio; i <= fim; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                quantidade++;
                soma += i;
            }
        }

        System.out.println("\nQuantidade de números mostrados: " + quantidade);
        System.out.println("Soma dos números: " + soma);

        // TODO code application logic here
    }
    
}
