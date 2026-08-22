package exercicios.udemy.condicionais.ex03;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        String resultado;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int A = sc.nextInt();
        
        System.out.print("Digite um número inteiro: ");
        int B = sc.nextInt();
        
        resultado = ((A % B == 0) || (B % A == 0)) ? " são múltiplos" : " não são múltiplos";
        
        System.out.println("\n========== MÚLTIPLOS ==========");
        System.out.println(A + " e " + B + resultado);
        
        sc.close();
    }
}
