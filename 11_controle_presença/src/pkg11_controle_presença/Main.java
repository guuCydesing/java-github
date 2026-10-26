/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11_controle_presença;
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
        int codigo;
        int inscritos;
        int presentes = 0;
        int ausentes = 0;
        
        System.out.print("Numero de inscritos: ");
         inscritos = sc.nextInt();

        while (inscritos <= 0) {
            System.out.println("Valor invalido! Digite novamente.");
            System.out.print("Numero de inscritos: ");
            inscritos = sc.nextInt();
        }

        for (int i = 1; i <= inscritos; i++) {
            System.out.print("Participante " + i + " (1 = presente, 0 = falta): ");
             codigo = sc.nextInt();

            while (codigo != 0 && codigo != 1) {
                System.out.println("Código invalido! Digite 1 ou 0.");
                System.out.print("Participante " + i + " (1 = presente, 0 = falta): ");
                codigo = sc.nextInt();
            }

            if (codigo == 1) {
                presentes++;
            } else {
                ausentes++;
            }
        }

        double porcentagem = presentes * 100.0 / inscritos;
        System.out.println("Presentes: " + presentes);
        System.out.println("Ausentes: " + ausentes);
        System.out.printf("Presença da turma: "+ porcentagem);

        if (porcentagem >= 75) {
            System.out.println("participação satisfatoria.");
        } else {
            System.out.println("participação insatisfatoria.");
        }
        // TODO code application logic here
    }
    
}
