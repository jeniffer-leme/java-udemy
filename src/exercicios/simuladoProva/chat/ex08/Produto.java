package exercicios.simuladoProva.chat.ex08;

public class Produto {
    private int codigo;
    private String descricao;
    private int quantidade;
    private double preco;

    public Produto(int codigo, String descricao, int quantidade, double preco) {
        setCodigo(codigo);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setPreco(preco);
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if(codigo > 0) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("O código precisa ser > 0");
        }
    }

    public String getDescriao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao != null) {
            this.descricao = descricao;
        } else {
            throw new IllegalArgumentException("A descrição precisa ser diferente de null");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("O preço não pode ser negativo");
        }
    }
    
    
}
