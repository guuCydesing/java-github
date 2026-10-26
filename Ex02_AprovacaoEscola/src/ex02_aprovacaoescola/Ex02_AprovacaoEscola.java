/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_aprovacaoescola;
import java.util.Scanner;
/** 
 *
 * @author guilherme.csousa2 
 */
public class Ex02_AprovacaoEscola {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          double nota1;
          double nota2;
        
          
            System.out.println("Digite a primeira Nota");
          nota1 = teclado.nextInt();
          
          System.out.println("Digite a segunda Nota");
         nota2 = teclado.nextInt();
        
         if (((nota1 + nota2)/2) < 6 ){
             System.out.println("Reprovado "+ ((nota1 + nota2)/2));
         }
         else if(((nota1 + nota2)/2) >= 6){
             System.out.println("Passou"+ ((nota1 + nota2)/2));
         
         }
             
        // TODO code application logic here
    }
    
}
