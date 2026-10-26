/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01_verificanumero;
import java.util.Scanner;
/**
 *
 * @author guilherme.csousa2
 */
public class EX01_VerificaNumero {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.println("digite um numero");
        
       n = teclado.nextInt();
        
        if (n > 0){
            System.out.println("positivo");
        }
        else if(n < 0){
            System.out.println("negativo");
        }
       else {
            System.out.println("igual a 0");}
    }
}
    
    

