/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04_analiseperfilmultas;
import java.util.Scanner;
/**
 *
 * @author guilherme.csousa2 
 */
public class Ex04_AnalisePerfilMultas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double v;
        boolean c;
        
        System.out.println("Digite a velocidade do motorista");
        v = teclado.nextDouble();
        System.out.println("O motorista estava de cinto?");
           c = teclado.hasNextBoolean();
        
        if (v >= 80){
            System.out.println("Multa por excesso de velocidade!");
        }
        if (v >= 150 ){
            System.out.println("Infração gravíssima: CNH Suspensa");
           
        }   
        if (c == true){
            System.out.println("Multa por falta de cinto!!");
        }
         
        // TODO code application logic here
    }
            // TODO code application logic here
    }
    

