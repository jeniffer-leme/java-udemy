package exercicios.udemy.condicionais.ex07;

import java.util.Scanner;

public class Coordenada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite as coordenadas de X e Y: ");
        double x = sc.nextDouble(); 
        double y = sc.nextDouble();
    
        if(x == 0 && y == 0) {
            System.out.println("Origem");
        } else if(x == 0.0 ) { 
            System.out.println("Eixo X");
        } else if(y == 0.0) { 
            System.out.println("Eixo Y");
        } else if(x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if(x < 0.0 && y > 0.0) { 
            System.out.println("Lado Q2 ");
        } else if(x < 0.0 && y < 0.0) { 
            System.out.println("Lado Q3");
        } else { 
            System.out.println("Lado Q4");
        }
        
        sc.close();
    }
}
