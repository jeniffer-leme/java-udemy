package exercicios.simuladoProva.chat.ex06;

public class Restaurante {
    private String nome;
    private String endereco;
    private String cnpj;
    private int telefone;
    private Mesa[] mesa;

    public Restaurante(String nome, String endereco, String cnpj, int telefone, int qtdMesas) {
        setNome(nome);
        setEndereco(endereco);
        setCnpj(cnpj);
        setTelefone(telefone);

        // cria todas as mesas vazias
        mesa = new Mesa[qtdMesas];
        for (int i = 0; i < qtdMesas; i++) {
            mesa[i] = new Mesa();
            mesa[i].setNumeroMesa(i);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser nulo");
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco != null) {
            this.endereco = endereco;
        } else {
            throw new IllegalArgumentException("O endereco não pode ser nulo");
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj != null) {
            this.cnpj = cnpj;
        } else {
            throw new IllegalArgumentException("O cnpj não pode ser nulo");
        }
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        if (telefone > 0) {
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("O telefone não pode ser < 0");
        }
    }

    private void validarMesa(int numMesa) {
        if (numMesa < 0 || numMesa >= mesa.length) {
            throw new IllegalArgumentException("Número de mesa inválido.");
        }
    }

    public String acomodarPessoas(int numMesa, int qtdPessoas) {
        validarMesa(numMesa);
        mesa[numMesa].setQtdPessoas(qtdPessoas);

        String texto = "\n------------------------------------";
        texto += "\nMesa: " + numMesa;
        texto += "\nPessoas acomodadas: " + qtdPessoas;

        return texto;
    }

    public String adicionarPedido(int numMesa, double valor) {
        validarMesa(numMesa);
        mesa[numMesa].adicionarPedido(valor);

        String texto = "\n------------------------------------";
        texto += "\nMesa: " + numMesa;
        texto += "\nPedido adicionado: R$ " + valor;
        texto += "\nTotal atual: R$ " + mesa[numMesa].getValorTotal();

        return texto;
    }
}
