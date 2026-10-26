/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08_estacoesdoano;
import java.util.Scanner;
/**
 *
 * @author guilherme.csousa2 
 */
public class Ex08_EstacoesDoAno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int M;
        
        System.out.println("digite um numero de 1 a 12 sendo os meses do ano para descobrir a estacao.");
        M = teclado.nextInt();
        //FORMA A
        switch (M){
            case 12:
            case 1:
            case 2:
                System.out.println("Verao");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("outono");
                 break;
            case 6:
            case 7:
            case 8:
                System.out.println("inverno"); 
                 break;
            case 9:
            case 10:
            case 11:
                System.out.println("Primavera");
                 break;
            default:
                System.out.println("Mes inexistente");
                break;
        }
        
        //FORMA B
        if (M == 12 || M == 1 || M == 2){
            System.out.println("Verao");
        }else if (M == 3 || M == 4 ||M == 5){
            System.out.println("outono");
        }else if (M ==6||M==7||M==8){
            System.out.println("inverno"); 
        }else if (M==9||M==10||M==11){
            System.out.println("Primavera");
        } else { System.out.println("Mes inexistente");
            }
        // TODO code application logic here
    }
    
}