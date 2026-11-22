package exercicios.estrutura_repetitiva.rep_for.ex04;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========= DIVISÃO =========");
        
        System.out.print("Digite a quantidade de duplas: ");
        int dupla = sc.nextInt();
        
        for (int i = 0; i < dupla; i++) {
            System.out.printf("\nDupla %d:\n", i + 1);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            if(b == 0.0) {
                throw new IllegalArgumentException("Não é porrível divisão por 0.0");
            }
            
            double div = a / b;
            
            System.out.printf("Divisão: %.2f\n", div);
        }
        
        sc.close();
    }
}
