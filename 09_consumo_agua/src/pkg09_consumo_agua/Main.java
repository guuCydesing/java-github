/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg09_consumo_agua;
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
       double total = 0;
        int diasAcima = 0;
        double consumo;
         double meta;

        System.out.print("Meta diária de consumo (litros): ");
         meta = sc.nextDouble();

        
        while (meta <= 0) {
            System.out.println("Meta inválida! Digite um valor positivo.");
            System.out.print("Meta diária de consumo (litros): ");
            meta = sc.nextDouble();
        }

        
        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Consumo do dia " + dia + " (litros): ");
             consumo = sc.nextDouble();

            while (consumo < 0) {
                System.out.println("Consumo inválido! Digite novamente.");
                System.out.print("Consumo do dia " + dia + " (litros): ");
                consumo = sc.nextDouble();
            }

            total += consumo;

            if (consumo > meta) {
                System.out.println("Meta ultrapassada!");
                diasAcima++;
            } else if (consumo == meta) {
                System.out.println("Meta atingida.");
            } else {
                System.out.println("Consumo dentro da meta.");
            }
        }
        System.out.printf("Consumo total: "+ total);
        System.out.printf("Media diaria: "+ (total / 7));
        System.out.println("Dias acima da meta: " + diasAcima);
        // TODO code application logic here
    }
    
}
