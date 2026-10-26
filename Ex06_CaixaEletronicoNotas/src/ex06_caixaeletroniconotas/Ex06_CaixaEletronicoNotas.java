/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06_caixaeletroniconotas;
import java.util.Scanner;

/**
 *
 * @author guilherme.csousa2 
 */
public class Ex06_CaixaEletronicoNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.print("Digite o valor do saque: ");
        valor = entrada.nextInt();

        if (valor % 10 == 0 && valor >= 100) {
            System.out.println("Notas de 100 disponíveis");
        } else if (valor % 10 == 0 && valor >= 50) {
            System.out.println("Notas de 50 disponíveis");
        } else if (valor % 10 == 0 && valor >= 20) {
            System.out.println("Notas de 20");
        } else if (valor % 10 == 0 && valor >= 10) {
            System.out.println("Notas de 10");
        } else {
            System.out.println("Valor inválido");
        }
        // TODO code application logic here
    }
    
}
