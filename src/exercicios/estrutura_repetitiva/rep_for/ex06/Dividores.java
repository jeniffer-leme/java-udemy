package exercicios.estrutura_repetitiva.rep_for.ex06;

import java.util.Scanner;

public class Dividores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=========== DIVISORES ===========");
        System.out.print("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        
        for (int i = 1; i <= valor; i++) {
            if(valor % i == 0) {
                System.out.println("Divisor: " + i);
            }
        }
        
        sc.close();
    }
}
