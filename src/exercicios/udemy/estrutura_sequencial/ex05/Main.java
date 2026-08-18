package exercicios.udemy.estrutura_sequencial.ex05;

public class Main {
    public static void main(String[] args) {
        Vendas v1 = new Vendas(1, 3, 12.95);
        Vendas v2 = new Vendas(2, 13, 3.89);
        
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        
        v2.setValor(4.75);
        System.out.println(v2.toString());
    }
}
