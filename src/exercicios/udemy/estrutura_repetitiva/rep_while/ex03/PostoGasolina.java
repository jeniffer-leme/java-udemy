package exercicios.udemy.estrutura_repetitiva.rep_while.ex03;

import java.util.Scanner;

public class PostoGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("============ PREFERÊNCIA ============");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Encerrar");

        System.out.print("\nPreferência: ");
        int opcao = sc.nextInt();

        while (opcao != 4) {
            if (opcao == 1) {
                alcool++;
            } else if (opcao == 2) {
                gasolina++;
            } else if (opcao == 3) {
                diesel++;
            }
            // Se for inválido (menor que 1 ou maior que 4), não soma nada e pede novamente no final

            System.out.print("Preferência: ");
            opcao = sc.nextInt();
        }

        System.out.println("\nMUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
