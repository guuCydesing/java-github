/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05_classificafinaldesemana;
import java.util.Scanner;
/**
 *
 * @author guilherme.csousa2 
 */
public class Ex05_ClassificaFinalDeSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int d;
        
        
        System.out.println("Digite um numero para escolher o Dia 1-Domingo,2-Segunda,3-terça,4-quarta,5-quinta,6-sexta,7-Sabado");
        d = teclado.nextInt();
        //Letra B
        switch (d){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil.");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Digito invalido");
                break;
        }
        //Letra A
        if (d >= 2 && d <= 6) {
            System.out.println("Dia útil");
        }else if (d ==1 || d == 7) {
            System.out.println("Fim de semana");
        }else  {
            System.out.println("Digito inalido");
        }
        
        // TODO code application logic here
    }
    
}
