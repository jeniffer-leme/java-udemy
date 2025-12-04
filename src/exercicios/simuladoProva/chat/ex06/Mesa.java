package exercicios.simuladoProva.chat.ex06;

public class Mesa {
    private int numeroMesa;
    private int qtdPessoas;
    private int qtdPedidos;
    private double valorTotal;

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        if(numeroMesa > 0) {
            this.numeroMesa = numeroMesa;
        } else {
            throw new IllegalArgumentException("O número de mesas precisa ser > 0");
        }
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        if(qtdPessoas > 0 && qtdPessoas < 5) {
            this.qtdPessoas = qtdPessoas;
        } else {
            throw new IllegalArgumentException("O número de pessoas precisa ser > 0 e < 5");
        }
    }

    public int getQtdPedidos() {
        return qtdPedidos;
    }

    public void setQtdPedidos(int qtdPedidos) {
        if(qtdPedidos >= 0) {
            this.qtdPedidos = qtdPedidos;
        } else {
            throw new IllegalArgumentException("O número de pedidos inválido");
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if(valorTotal >= 0) {
            this.valorTotal = valorTotal;
        } else {
            throw new IllegalArgumentException("O valor inválido");
        }
    }
    
    public void adicionarPedido(double valor) {
        if(valor > 0) {
            setQtdPedidos(getQtdPedidos() + 1);
            setValorTotal(getValorTotal() + valor);
        } else {
            throw new IllegalArgumentException("Valor de pedido inválido");
        }
    }
    
    public String fecharConta() {
        String texto = "\n-------------------------------------";
        texto += "\nNúmero da Mesa: " + getNumeroMesa();
        texto += "\nQuantidade de Pessoas: " + getQtdPessoas();
        texto += "\nQuantidade de Pedidos: " + getQtdPedidos();
        
        double porc = getValorTotal() * 1.10;
        texto += "\nValor do Pedido: " + getValorTotal();
        
        double div = porc / getQtdPessoas();
        texto += "\nValor do Pedido por Pessoa: " + div;
        
        setQtdPedidos(0);
        setQtdPessoas(0);
        setValorTotal(0);
        
        return texto;
    }
}
