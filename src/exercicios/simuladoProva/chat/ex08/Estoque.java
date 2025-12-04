//Não consegui
package exercicios.simuladoProva.chat.ex08;

public class Estoque {
    private Produto produto[];

    public Estoque() {
        produto = new Produto[50];
    }
    
    public void cadastrarProduto(int c, String d, int q, double p) {
        for(int i = 0; i < produto.length; i++) {
            if(produto[i] == null) {
                produto[i] = new Produto(c, d, q, p);
                return;
            } else {
                throw new IllegalArgumentException("Não tem quantidade disponível.");
            }
        }
    }
    
    public Produto buscar(int codigo) {
        for(int i = 0; i < produto.length; i++) {
            if(produto[i] != null && produto[i].getCodigo() == codigo) {
                return produto[i];
            }
        } 
            return null;
    }
    
    public void alterarQuantidade(int codigo, int q) {
        for(int i = 0; i < produto.length; i++) {
            if(produto[i] != null && produto[i].getCodigo() == codigo) {
                produto[i].setQuantidade(q);
                return;
            }
        }
        throw new IllegalArgumentException("Produto não existe.");
    }
    
    public double valorTotal() {
        double soma = 0;
        
        for(int i = 0; i < produto.length; i++) {
            if(produto[i] != null) {
                soma += produto[i].getPreco() * produto[i].getQuantidade();
            }
        }
        return soma;
    }

    @Override
    public String toString() {
        String texto = "\n========= ESTOQUE =========";

        boolean vazio = true;

        for (int i = 0; i < produto.length; i++) {
            if (produto[i] != null) {
                texto += produto[i].toString(); // chama o toString do Produto
                vazio = false;
            }
        }

        if (vazio) {
            texto += "\nNenhum produto cadastrado.";
        }

        texto += "\n============================\n";

        return texto;
    }

    
    
}
