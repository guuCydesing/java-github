/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03_calculadorabasica;
import java.util.Scanner;
/**
 *
 * @author guilherme.csousa2 
 */
public class Ex03_CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1;
        double n2;
        int n;
        System.out.println("Digite o primeiro numero");
        n1 = teclado.nextInt();
        
        System.out.println("Digite o segundo numero");
        n2 = teclado.nextInt();
        
        System.out.println("Digite um numero para escolher a operação 1-Soma,2-Subtração,3-Multiplicação,4-Divisão");
        n = teclado.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("A soma é: "+ (n1 + n2));
                break;
            case 2:
                System.out.println("o resultado da subtração é: "+ (n1 - n2));
                 break;
            case 3:
                System.out.println("O resultado da multiplicação dos numeros é: "+ (n1 * n2));
                 break;
            case 4:
                System.out.println("o resultado da Divisão é: "+ (n1 / n2));
                 break;
            default:
                System.out.println("Operação Invalida!!!");
                break;
          
        }
        // TODO code application logic here
    }
    
}
