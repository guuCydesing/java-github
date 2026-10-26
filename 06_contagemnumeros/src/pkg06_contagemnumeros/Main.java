/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg06_contagemnumeros;
 import java.util.Scanner;
/**
 *
 * @author giraw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int soma = 0;
        int numero;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º numero inteiro: ");
             numero = sc.nextInt();

            soma += numero;
            if (numero % 2 == 0) {
                System.out.println(numero + " e par");
                pares++;
            } else {
                System.out.println(numero + " e ímpar");
                impares++;
            }
        }
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Soma de todos os numeros: " + soma);
        // TODO code application logic here
    }
    
}
