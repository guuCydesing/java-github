/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg07_senha_acesso;
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

        final int SENHA = 1234; 
        final int MAXTENT = 3;

        int tentativas = 0;
        boolean acessoPermitido = false;
        int digitada;

        while (tentativas < MAXTENT && !acessoPermitido) {
            System.out.print("Digite a senha: ");
             digitada = sc.nextInt();
            tentativas++;

            if (digitada == SENHA) {
                acessoPermitido = true;
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        if (acessoPermitido) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso bloqueado!");
        }
        System.out.println("Tentativas utilizadas: " + tentativas);
        // TODO code application logic here
    }
    
}
