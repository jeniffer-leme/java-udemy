package exercicios.udemy.estrutura_sequencial.ex03;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        int A, B, C, D, diferenca;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro (A): ");
        A = sc.nextInt();
        
        System.out.print("Digite um valor inteiro (B): ");
        B = sc.nextInt();
        
        System.out.print("Digite um valor inteiro (C): ");
        C = sc.nextInt();
        
        System.out.print("Digite um valor inteiro (D): ");
        D = sc.nextInt();
        
        diferenca = A * B - C * D;
        
        System.out.println();
        
        System.out.println(" " + A + " x " + B + " - " + C + " x " + D);
        
        System.out.println("Diferença: " + diferenca);
        
        sc.close();
    }
}
