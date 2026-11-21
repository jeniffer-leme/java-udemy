package exercicios.udemy.heranca_polimorfismo.ex01;

public class Produto {
    private String nome;
    private double preco;

    public Produto() {
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String priceTag() {
        return nome + " $ " + String.format("%.2f", preco);
    }
    
}
