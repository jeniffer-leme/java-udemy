package exercicios.estrutura_repetitiva.rep_for.ex03;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b ;
        double c;

        System.out.print("Digite a quantidade de casos de teste: ");
        int teste = sc.nextInt();

        System.out.println("\nDigite os valores Decimais");

        for (int i = 0; i < teste; i++) {
            System.out.printf("Caso de Teste %d:\n", i + 1);
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            double media = ((a * 2.0) + (b * 3.0) + (c * 5.0)) / 10;

            System.out.printf("Média: %.2f\n\n", media);
        }
        
        sc.close();
    }
}