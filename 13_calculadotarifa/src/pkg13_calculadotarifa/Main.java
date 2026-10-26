/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg13_calculadotarifa;
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

        final double TARIFA_BASE = 5.00;
        double arrecadado = 0;
        int gratuitas = 0;
        int idade ;
        int estudante;
        double tarifa;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Idade do passageiro " + i + ": ");
             idade = sc.nextInt();
            System.out.print("Possui cadastro estudantil? (1 = sim, 0 = não): ");
             estudante = sc.nextInt();

            if (idade >= 65) {
                tarifa = 0;
                gratuitas++;
            } else if (estudante == 1) {
                tarifa = TARIFA_BASE / 2;
            } else {
                tarifa = TARIFA_BASE;
            }

            arrecadado += tarifa;
            System.out.printf("Tarifa: R$ "+ tarifa);
        }

        System.out.printf("Total arrecadado: R$ "+ arrecadado);
        System.out.println("Passagens gratuitas: " + gratuitas);
        // TODO code application logic here
    }
    
}
