/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10_calculadoradescontosloja;
import java.util.Scanner;
/**
 *
 * @author guilherme.csousa2
 */
public class Ex10_CalculadoraDescontosLoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int C;
        double p;
        System.out.println("Digite o preco do produto");
        p = teclado.nextDouble();
        System.out.println("Digite um numero para calcular seus descontos 1-Cliente comum, 2-Cliente VIP,3-Cliente Atacadista.");
        C = teclado.nextInt();
        switch (C){
            case 1:
                System.out.println("Cliente Comum sem descontos valor final = "+ p +'$' );
                break;
            case 2:
                System.out.println("Cliente VIP seu desconto e de 10% = "+ (p * 0.10));
                System.out.println("Valor final de: "+ (p -(p * 0.10))+'$');
                break;
            case 3:
                if (p >= 1000){
                    System.out.println("Cliente Atacadista seu desconto e de 20% = "+ (p * 0.20));
                     System.out.println("Valor final de: "+ (p -(p * 0.20))+'$');
                }else {
                System.out.println("Cliente Atacadista seu desconto e de 15% = "+ (p * 0.15));
                 System.out.println("Valor final de: "+ (p -(p * 0.15))+'$');
                }
        }
        // TODO code application logic here
    }
    
}