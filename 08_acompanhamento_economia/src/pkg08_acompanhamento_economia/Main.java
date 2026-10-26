/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg08_acompanhamento_economia;
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

        final double META = 200.00;
        double poupado = 0;
        int semanas = 0;
        double valor;

        while (poupado < META) {
            System.out.print("Valor economizado na semana: R$ ");
            valor = sc.nextDouble();

            if (valor <= 0) {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            } else {
                poupado += valor;
                semanas++;

                System.out.printf("Já poupado: R$ "+ poupado);
                if (poupado < META) {
                    System.out.printf("Ainda falta: R$ "+ (META - poupado));
                }
            }
        }

        System.out.println("\n" + " Meta alcançada!");
        System.out.println("Semanas necessarias: " + semanas);
        System.out.printf("Valor total economizado: R$ "+ poupado);
        // TODO code application logic here
    }
    
}
