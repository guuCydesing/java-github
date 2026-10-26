/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03descontos;
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

        double arrecadado = 0;
        double valor;
        double percentual;
        double desconto;
        double valorFinal;
        for (int i = 1; i <= 5; i++) {
            System.out.print("\n"+ "Valor da compra " + i + ": R$ ");
             valor = sc.nextDouble();

            
            if (valor < 0) {
                System.out.println("Valor recusado! Digite um valor não negativo.");
                i--;
                
            }
            if (valor < 100) {
                percentual = 0;
            } else if (valor < 200) {
                percentual = 0.05;
            } else {
                percentual = 0.10;
            }

             desconto = valor * percentual;
             valorFinal = valor - desconto;
            arrecadado += valorFinal;

            System.out.printf("Desconto: R$ "+ desconto +" | Valor final: R$ "+ valorFinal);
        }

        System.out.printf("Total arrecadado (com descontos): R$ "+ arrecadado);
        // TODO code application logic here
    }
    
}
