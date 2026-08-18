package exercicios.udemy.estrutura_sequencial.ex05;

public class Vendas {
    private int id;
    private int quantidade;
    private double valor;
    private double soma;

    public Vendas(int id, int quantidade, double valor) {
        setId(id);
        setQuantidade(quantidade);
        setValor(valor);
    }

    public int getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double getSoma() {
        return valor * quantidade;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "ID: " + getId() + 
                "\nQuantidade: " + getQuantidade() + 
                "\nValor: " + getValor() + 
                "\nTotal: R$" + String.format("%.2f", getSoma()) + "\n";
    }
}
