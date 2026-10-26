/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12_velocidade;
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

        final double LIMITE = 60;
        double maior = 0;
        int acima = 0;
        double velocidade;
        for (int i = 1; i <= 8; i++) {
            System.out.print("Velocidade do veículo " + i + " km/h");
             velocidade = sc.nextDouble();

            while (velocidade < 0) {
                System.out.println("Velocidade invalida! Digite novamente.");
                System.out.print("Velocidade do veículo " + i + " km/h");
                velocidade = sc.nextDouble();
            }

            if (velocidade > maior) {
                maior = velocidade;
            }

            if (velocidade > LIMITE) {
                System.out.println("Acima do limite");
                acima++;
            } else {
                System.out.println("Dentro do limite");
            }
        }

        System.out.println("Maior velocidade registrada: " + maior + " km/h");
        System.out.println("Veículos acima do limite: " + acima);
        
        // TODO code application logic here
    }
    
}
