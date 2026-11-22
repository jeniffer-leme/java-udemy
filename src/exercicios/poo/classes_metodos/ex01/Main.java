package exercicios.poo.classes_metodos.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Retangulo r1 = new Retangulo();
        
        System.out.println("======== RETÂNGULO ========");
        System.out.print("Digite a altura: ");
        r1.altura = sc.nextDouble();
        
        System.out.print("Digite a base: ");
        r1.largura = sc.nextDouble();
        
        System.out.printf("\nÁREA: %.2f\n", r1.Area());
        System.out.printf("PERIMETRO: %.2f\n", r1.Perimetro());
        System.out.printf("DIAGONAL: %.2f\n", r1.Diagonal());
    }
}
