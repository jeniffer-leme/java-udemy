package exercicios.udemy.condicionais.ex02;

import java.util.Scanner;

public class ImPar {
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========= ÍMPAR x PAR =========");
        System.out.print("Digite um valor inteiro: ");
        num = sc.nextInt();
        
        String status = (num % 2 == 0) ? "par" : "ímpar";
        
        System.out.println("O valor " + num + " é " + status);
        
        sc.close();
    }
}
