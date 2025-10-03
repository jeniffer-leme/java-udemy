package aulas.associacao.agregacao;

public class Empresa {
    private String nome;

    public Empresa(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    
}
