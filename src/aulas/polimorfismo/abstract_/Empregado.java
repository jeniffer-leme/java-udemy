package aulas.polimorfismo.abstract_;

//uma classe abstrata é uma classe que não está pronta ou se encontra parcialmente pronta, portanto não pode gerar objetos
public abstract class Empregado {
    private String nome;
    private String cpf;

    public Empregado(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("nome não pode ser nulo.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null){
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("cpf não pode ser nulo.");
        }
    }
    
    //método abstrato é um método que não está pronto
    //uma classe concreta que herdar da classe Empregado deverá dar corpo aos métodos abstratos
    public abstract double proventoSemanal();
    
    @Override
    public String toString() {
        return getNome() + " deve receber " + proventoSemanal();
    }
    
}
