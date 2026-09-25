package exercicios.udemy.estrutura_repetitiva.rep_while.ex03;

import java.util.Scanner;

public class PostoGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("============ PREFERÊNCIA ============");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Encerrar");
        
        System.out.print("\nPreferência: ");
        int opcao = sc.nextInt();
        
        while(opcao != 4) {
            if(opcao == 1) {
                System.out.println("Preferência: Álcool.");
            } else if(opcao == 2) { 
                System.out.println("Preferência: Gasolina.");
            }else if(opcao == 3) { 
                System.out.println("Preferência: Diesel.");
            }
            
            System.out.print("\nPreferência: ");
            opcao = sc.nextInt();
        }
        
        System.out.println("\nMuito Obrigado!");
        
        sc.close();
    }
    
}
