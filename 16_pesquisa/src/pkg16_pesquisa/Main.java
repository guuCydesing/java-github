/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg16_pesquisa;
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

        int soma = 0;
        int quantidade = 0;
        int notasAltas = 0;
        int nota;

        System.out.print("Nota de 1 a 5 (0 para encerrar): ");
         nota = sc.nextInt();

        while (nota != 0) {
            if (nota >= 1 && nota <= 5) {
                soma += nota;
                quantidade++;

                if (nota >= 4) {
                    notasAltas++;
                }
            } else {
                System.out.println("Nota invalida Use valores de 1 a 5.");
            }

            System.out.print("Nota de 1 a 5 (0 para encerrar): ");
            nota = sc.nextInt();
        }

        System.out.println("\n"+" Resultado da pesquisa");
        if (quantidade == 0) {
            System.out.println("Não tem dados suficientes para calcular a media.");
        } else {
            System.out.printf("Media das notas: "+ (soma / quantidade)+"\n");
        }
        System.out.println("Pessoas que deram nota 4 ou 5: " + notasAltas);

        // TODO code application logic here
    }
    
}
