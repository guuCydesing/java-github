/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02avaliacaonotas;
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
        int qtd;
        double soma = 0;
        int aprovados = 0;
        int abaixo = 0;
        double nota;
        System.out.print("Quantidade de estudantes: ");
         qtd = sc.nextInt();
        while (qtd <= 0) {
            System.out.println("Quantidade inválida! Digite novamente.");
            System.out.print("Quantidade de estudantes: ");
            qtd = sc.nextInt();
        }

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Nota do estudante " + i + " (0 a 10): ");
              nota = sc.nextDouble();
            
            while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                System.out.print("Nota do estudante " + i + " (0 a 10): ");
                nota = sc.nextDouble();
            }

            soma += nota;
            if (nota >= 6) {
                System.out.println("Resultado: satisfatório");
                aprovados++;
            } else {
                System.out.println("Resultado: insatisfatório");
                abaixo++;
            }
        }
        System.out.printf("Média da turma: %.2f%n", soma / qtd);
        System.out.println("Estudantes com nota >= 6: " + aprovados);
        System.out.println("Estudantes com nota abaixo de 6: " + abaixo);

        // TODO code application logic here
    }
    
}
