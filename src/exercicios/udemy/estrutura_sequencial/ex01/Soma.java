package exercicios.udemy.estrutura_sequencial.ex01;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int x;
        int y;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        x = sc.nextInt();
        
        System.out.print("Digite um valor inteiro: ");
        y = sc.nextInt();
        
        int soma = x + y;
        
        System.out.println();
        
        System.out.println("SOMA: " + x + " + " + y + "  = " + soma);
        
        sc.close();
    }
}
