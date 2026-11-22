package exercicios.estrutura_repetitiva.rep_for.ex02;

import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int in = 0;
        int out = 0;
        
        System.out.print("Digite a quantidade de valores: ");
        int valor = sc.nextInt();
        
        System.out.println("\nDigite os valores ");
        
        for (int i = 0; i < valor; i++) {
            System.out.print("Valor: ");
            int valores = sc.nextInt();
            
            if((valores >= 10) && (valores <= 20)) {
                in++;
            } else {
                out++;
            }
        }
        
        System.out.println("\nDENTRO: " + in);
        System.out.println("FORA: " + out);
        
        sc.close();
    }
}
