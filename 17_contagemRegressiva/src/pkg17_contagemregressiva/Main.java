/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg17_contagemregressiva;
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
        int exibidos = 0;
        int inicio;
        
        System.out.print("Ponto inicial da contagem (inteiro positivo): ");
        inicio = sc.nextInt();

        
        while (inicio <= 0) {
            System.out.println("Valor inválido! Digite um número positivo.");
            System.out.print("Ponto inicial da contagem (inteiro positivo): ");
            inicio = sc.nextInt();
        }

        for (int i = inicio; i >= 0; i--) {
            System.out.println(i);
            exibidos++;

            if (i == 0) {
                System.out.println("O evento começou!");
            }
        }

        System.out.println("Números exibidos antes da mensagem final: " + exibidos);

        // TODO code application logic here
    }
    
}
