package exercicios.arrays_listas.lista.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Produto> list = new ArrayList();
        
        System.out.print("Digite a quantidade de produtos: ");
        int produto = sc.nextInt();
        
        for (int i = 0; i < produto; i++) {
            System.out.println("\nProduto " + (i + 1));
        
            System.out.print("Código: ");
            int codigo = sc.nextInt();
            
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            
            Produto prod = new Produto(codigo, nome, preco);
            
            list.add(prod);
        }
        
        System.out.print("\nDigite o ID do aumento: ");
        int codAumento = sc.nextInt();
        
        int pos = posicao(list, codAumento);
        
        if(pos == -1) {
            System.out.println("Produto não encontrado.");
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            
            list.get(pos).desconto(porcentagem);
        }
        
        
        System.out.println("\n=========== PRODUTOS ===========");
        for(Produto prod : list) {
            System.out.println(prod);
        }
        
        sc.close();
    }
    
    public static int posicao(List<Produto> list, int codigo) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getCodigo() == codigo) {
                return i;
            }
        }
        
        return -1;
    } 
}
