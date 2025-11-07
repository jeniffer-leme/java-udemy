package aulas.polimorfismo.interface_;

public class Main {
    public static void main(String[] args) {
        
        Assalariado empregado = new Assalariado("José Silva", 5500.50);
        Boleto conta = new Boleto("CPFL", 2500.00, 15.0, false);
        
        conta.setVencido(true);
        
        Pagavel saida1 = empregado;
        Pagavel saida2 = conta;
 
        System.out.println(saida1.getDescricao() + " " + saida1.getValorAPagar());
        System.out.println(saida2.getDescricao() + " " + saida2.getValorAPagar());
    }
}
