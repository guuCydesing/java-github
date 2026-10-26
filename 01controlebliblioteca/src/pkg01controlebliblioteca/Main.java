/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg01controlebliblioteca;
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
        int total;
        int infantil = 0;
        int geral = 0;
        int idoso = 0;
        int idade;
        System.out.print("Quantos visitantes serão atendidos? ");
         total = sc.nextInt();

        for (int i = 1; i <= total; i++) {
            System.out.print("Idade do visitante " + i + ": ");
            idade = sc.nextInt();
            while (idade < 0) {
                System.out.println("Idade inválida! Digite novamente.");
                System.out.print("Idade do visitante " + i + ": ");
                idade = sc.nextInt();
            }

            if (idade < 12) {
                infantil++;
            } else if (idade <= 59) {
                geral++;
            } else {
                idoso++;
            }
        }
        System.out.println("Público infantil: " + infantil);
        System.out.println("Público geral: " + geral);
        System.out.println("Público idoso: " + idoso);
        System.out.println("Total atendido: " + total);

        // TODO code application logic here
    }
    
}
