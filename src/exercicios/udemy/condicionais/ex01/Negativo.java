package exercicios.udemy.condicionais.ex01;

import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========== NEGATIVO x POSITIVO ==========");
        
        System.out.print("Digite um valor inteiro: ");
        num = sc.nextInt();
        
        String status = (num > 0) ? "positivo" : (num < 0) ? "negativo" : "neutro";
        
        System.out.println("O valor " + num + " é " + status);
        
        sc.close();
    }
}
