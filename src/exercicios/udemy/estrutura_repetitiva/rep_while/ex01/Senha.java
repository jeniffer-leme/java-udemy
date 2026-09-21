package exercicios.udemy.estrutura_repetitiva.rep_while.ex01;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("BLOQUEADO");
        System.out.print("Senha: ");
        int senha = sc.nextInt();
        
        while(senha != 2005) {
            System.out.println("Senha inválida! Tente novamente.\n");
            System.out.println("BLOQUEADO");
            System.out.print("Senha: ");
            senha = sc.nextInt();
        }
        
        System.out.println("\nDESBLOQUEADO");
        System.out.println("Acesso permitido");
        
        sc.close();
    }
}
