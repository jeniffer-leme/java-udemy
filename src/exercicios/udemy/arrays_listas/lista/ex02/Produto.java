package exercicios.udemy.arrays_listas.lista.ex02;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        setCodigo(codigo);
        setNome(nome);
        setPreco(preco);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    
    public void desconto(double porcentagem) { 
        preco += preco * porcentagem / 100;
    }

    @Override
    public String toString() {
        return "\nCódigo: " + getCodigo() + 
                "\nNome: " + getNome() + 
                "\nPreço: " + getPreco() + "\n";
    }
    
}
