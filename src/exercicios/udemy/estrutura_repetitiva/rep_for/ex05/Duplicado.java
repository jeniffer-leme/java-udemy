package exercicios.udemy.estrutura_repetitiva.rep_for.ex05;

import java.util.Scanner;

public class Duplicado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        
        for (int i = 1; i <= valor; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            
            System.out.printf("\nCaso %d:\n", i);
            System.out.printf("%d, %d, %d\n\n", i, quadrado, cubo);
        }
        
        sc.close();
    }
}
