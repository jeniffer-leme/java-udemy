package exercicios.udemy.estrutura_repetitiva.rep_for.ex01;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        
        if((valor < 1) || (valor > 1000)) {
            throw new IllegalArgumentException("Valor precisa ser entre 1 a 1000.");
        }
        
        for (int i = 1; i <= valor; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
