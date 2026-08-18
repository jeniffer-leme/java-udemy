package exercicios.udemy.estrutura_sequencial.ex06;

import java.util.Scanner;

public class Geometria {
    public static void main(String[] args) {
        double A;
        double B;
        double C;
        
        double PI = 3.14159;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor para A: ");
        A = sc.nextDouble();
        
        System.out.print("Digite um valor para B: ");
        B = sc.nextDouble();
        
        System.out.print("Digite um valor para C: ");
        C = sc.nextDouble();
        
        double triangulo = (A * C) / 2.0;
        double circulo = Math.pow(C, 2) * PI;
        double trapezio = ((A + B) * C) / 2.0;
        double quadrado = B * B;
        double retangulo = A * B;
        
        System.out.println("\n======== GEOMETRIA ========");
        
        System.out.printf("Triangulo: %.2f\n", triangulo);
        System.out.printf("Circulo: %.2f\n", circulo);
        System.out.printf("Trapézio: %.2f\n", trapezio);
        System.out.printf("Quadrado: %.2f\n", quadrado);
        System.out.printf("Retângulo: %.2f\n", retangulo);
        
        sc.close();
    }
}
