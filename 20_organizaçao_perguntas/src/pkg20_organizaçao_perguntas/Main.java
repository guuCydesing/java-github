/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20_organizaçao_perguntas;
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

        int destaques = 0;
        int maiorPontuacao = 0;
        int resposta;
        int pontos = 0;
        
        for (int participante = 1; participante <= 5; participante++) {
            
            System.out.println("\n"+"Participante " + participante);

            for (int pergunta = 1; pergunta <= 4; pergunta++) {
                
                System.out.print("Pergunta " + pergunta + " (1 = acertou, 0 = errou): ");
                 resposta = sc.nextInt();

                while (resposta != 0 && resposta != 1) {
                    
                    System.out.println("Resposta invalida! Digite 1 ou 0.");
                    System.out.print("Pergunta " + pergunta + " (1 = acertou, 0 = errou): ");
                    resposta = sc.nextInt();
                }

                if (resposta == 1) {
                    pontos += 2;
                }
            }

            System.out.println("Pontuacao: " + pontos);

            if (pontos >= 6) {
                System.out.println("Classificacao: DESTAQUE");
                destaques++;
            } else {
                System.out.println("Classificacao: sem destaque");
            }

            if (pontos > maiorPontuacao) {
                maiorPontuacao = pontos;
            }
        }

        System.out.println("\n"+"Relatorio do torneio ");
        System.out.println("Participantes em destaque: " + destaques);
        System.out.println("Maior pontuacao: " + maiorPontuacao);
        // TODO code application logic here
    }
    
}
