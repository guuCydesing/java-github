/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09_categorianatacao;
import java.util.Scanner;
/**
 *
 * @author guilherme.csousa2
 */
public class Ex09_CategoriaNatacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      int idade;
        System.out.println("Qual e sua idade?");
        idade = teclado.nextInt();
        
        if(idade >= 5 &&idade <= 7){
            System.out.println("Infatil A");
        }else if(idade >=8 && idade<= 10){
            System.out.println("Infantil B");
        }else if(idade >= 11 && idade <= 13){
            System.out.println("Juvenil A");
        }else if(idade >= 14 && idade <= 17){
            System.out.println("Juvenil B");
        }else if(idade >= 18){
            System.out.println("Adulto");
        }else {
            System.out.println("Idade insuficiente");
        }
        // TODO code application logic here
    }
    
}

