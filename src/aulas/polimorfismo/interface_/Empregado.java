package aulas.polimorfismo.interface_;

// a classe Empregado tem uma relação de "é um" com a interface Pagavel
public abstract class Empregado implements Pagavel {
    
    private String nome;

    public Empregado(String nome) {
        setNome(nome);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser nulo.");
        }
    }

    //classes concretas serão obrigadas a dar corpo (implementação) ao método abstrato proventoSemanal()
    public abstract double proventoSemanal();
    
    @Override
    public double getValorAPagar() {
        return proventoSemanal();
    }

    @Override
    public String toString() {
        return "Empregado (" + getNome() + ", " + proventoSemanal() + ")";
    }
    
    
}
