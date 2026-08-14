package exercicios.udemy.estrutura_sequencial.ex02;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        double raio, area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        
        area = Math.PI * Math.pow(raio, 2);
        
        System.out.println();
        
        System.out.printf("Área: %.4f%n", area);
        
        sc.close();
    }
}
