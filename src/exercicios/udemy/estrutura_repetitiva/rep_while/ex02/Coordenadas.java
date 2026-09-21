package exercicios.udemy.estrutura_repetitiva.rep_while.ex02;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("======== COORDENADAS ========");
        
        System.out.print("Digite X: ");
        double X = sc.nextDouble();
        
        System.out.print("Digite Y: ");
        double Y = sc.nextDouble();
        
        while(X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("Primeiro Quadrante.");
            } else if (X < 0 && Y > 0) {
                System.out.println("Segundo Quadrante.");
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro Quadrante.");
            } else {
                System.out.println("Quarto Quadrante.");
            }
            
            System.out.print("\nDigite X: ");
            X = sc.nextDouble();
            
            System.out.print("Digite Y: ");
            Y = sc.nextDouble();
        }
        
        System.out.println("\nEncerrado! Coordenada nula.");
        
        sc.close();
    }
}
