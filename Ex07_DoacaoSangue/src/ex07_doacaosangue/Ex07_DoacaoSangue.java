/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07_doacaosangue;
import java.util.Scanner;
/**
 *
 * @author guilherme.csousa2 
 */
public class Ex07_DoacaoSangue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        double peso;
        double h;
         System.out.println("Qual sua idade?");
         idade = teclado.nextInt();
         System.out.println("qual seu peso?");
         peso = teclado.nextDouble();
         System.out.println("Quantas horas vc dormiu?");
         h = teclado.nextDouble();
        //FORMA A
         if (idade >= 16){
         if(idade <= 69)
         if (peso >= 50)
         if (h >= 6)System.out.println("Autorizado a doar sangue");
         
         }if (idade < 16){
            System.out.println("Não autorizado a doar por causa da idade!! " + idade);
         }if (idade > 69){
             System.out.println("Não autorizado a doar por causa da idade!! " + idade);
        }if (peso < 50){
             System.out.println("peso muito abaixo!! Nao autorizado a doar " + peso);
         }if(h < 6){
             System.out.println("Nao dormiu o suficiente Nao autorizado a doar!! " + h);
         }
         
         //FORMA B
         if (idade < 16 || idade > 69) {
            System.out.println("Não autorizado a doar por causa da idade: " + idade);
        } else if (peso < 50) {
            System.out.println("Peso muito baixo. Não autorizado a doar: " + peso);
        } else if (h < 6) {
            System.out.println("Não dormiu o suficiente. Não autorizado a doar: " + h);
        } else {
            System.out.println("Autorizado a doar sangue");
        }   
    }     
        // TODO code application logic here
    }
