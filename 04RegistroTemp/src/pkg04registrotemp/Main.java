/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04registrotemp;
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

        double somaTemperaturas = 0;
        int diasAcima = 0;
        double temp;
        
        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Temperatura do dia " + dia + "(°C): ");
            temp = sc.nextDouble();

            somaTemperaturas += temp;

            if (temp < 18) {
                System.out.println("Medicao abaixo de 18 °C");
            } else if (temp <= 28) {
                System.out.println("Medicao entre 18 °C e 28 °C");
            } else {
                System.out.println("Medicao acima de 28 °C");
                diasAcima++;
            }
        }

        System.out.printf("Temperatura media: "+(somaTemperaturas / 7) +" °C" );
        System.out.println("Dias acima de 28 °C: " + diasAcima);

        // TODO code application logic here
    }
    
}
