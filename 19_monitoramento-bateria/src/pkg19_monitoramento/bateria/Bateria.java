/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg19_monitoramento.bateria;
import java.util.Scanner;
/**
 *
 * @author giraw
 */
public class Bateria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carga = 100;
        int hora = 0;
        int consumo;

        while (carga > 0 && hora < 8) {
            System.out.print("Hora " + (hora + 1) + " - pontos percentuais consumidos: ");
             consumo = sc.nextInt();

            while (consumo < 0) {
                System.out.println("Consumo inválido! Digite novamente.");
                System.out.print("Hora " + (hora + 1) + " - pontos percentuais consumidos: ");
                consumo = sc.nextInt();
            }

            hora++;
            carga -= consumo;
            if (carga < 0) {
                carga = 0;
            }

            System.out.println("Carga restante: " + carga + "%");

            if (carga <= 20) {
                System.out.println("AVISO: bateria baixa!");
            }
        }

        System.out.println("\n"+"Simulacao encerrada apos " + hora + " horas.");
        System.out.println("Carga final: " + carga + "%");
        // TODO code application logic here
    }
    
}
