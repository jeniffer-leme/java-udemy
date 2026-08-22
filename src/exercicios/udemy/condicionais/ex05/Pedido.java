package exercicios.udemy.condicionais.ex05;

import java.util.Scanner;

public class Pedido {
    public static void main(String[] args) {
        int opcao;
        int quantidade = 0;
        double preco = 0.0;
    
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n============= CARDÁPIO =============");
            System.out.println("CODIGO   ESPECIFICAÇÃO       PREÇO");
            System.out.println("1        Cachorro Quente     R$ 4.00");
            System.out.println("2        X-Salada            R$ 4.50");
            System.out.println("3        X-Bacon             R$ 5.00");
            System.out.println("4        Torrada simples     R$ 2.00");
            System.out.println("5        Refrigerante        R$ 1.50");
            System.out.println("0        Sair");
            System.out.println();
            
            System.out.print("Digite o código: ");
            opcao = sc.nextInt();
            
            
            switch (opcao) {
                case 1:
                    preco += 4.00;
                    quantidade++;
                    break;
                    
                case 2:
                    preco += 4.50;
                    quantidade++;
                    break;
                    
                case 3:
                    preco += 5.00;
                    quantidade++;
                    break;
                    
                case 4:
                    preco += 2.00;
                    quantidade++;
                    break;
                    
                case 5:
                    preco += 1.50;
                    quantidade++;
                    break;
                    
                case 0:
                    System.out.println("Você saiu!");
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao != 0);
        
        
        System.out.println("\nQuantidade: " + quantidade);
        System.out.printf("Total: R$%.2f\n", preco);
        
        sc.close();
    }
}
