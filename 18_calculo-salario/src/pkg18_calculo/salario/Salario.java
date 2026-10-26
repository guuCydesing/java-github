/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg18_calculo.salario;
import java.util.Scanner;
/**
 *
 * @author giraw
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        double folha = 0;
        double valorHora;
        int horas;
        int extras;
        double salario;                
        for (int i = 1; i <= 6; i++) {
            System.out.println("Funcionário " + i);

            System.out.print("Valor da hora: R$ ");
             valorHora = sc.nextDouble();
            while (valorHora < 0) {
                System.out.println("Valor invalido! Digite novamente.");
                System.out.print("Valor da hora: R$ ");
                valorHora = sc.nextDouble();
            }

            System.out.print("Horas trabalhadas na semana: ");
             horas = sc.nextInt();
            while (horas < 0) {
                System.out.println("Horas inválidas! Digite novamente.");
                System.out.print("Horas trabalhadas na semana: ");
                horas = sc.nextInt();
            }

            
            if (horas > 40) {
                 extras = horas - 40;
                salario = 40 * valorHora + extras * valorHora * 1.5;
            } else {
                salario = horas * valorHora;
            }

            folha += salario;
            System.out.printf("Salario semanal: R$ "+ salario+"\n");
        }

        System.out.printf("Total da folha de pagamento: R$ "+ folha);
        // TODO code application logic here
    }
    
}
