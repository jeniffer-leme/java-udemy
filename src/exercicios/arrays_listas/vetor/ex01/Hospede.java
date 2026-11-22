package exercicios.arrays_listas.vetor.ex01;

public class Hospede {
    public String nome;
    public String email;

    public Hospede(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + 
                "\nEmail: " + getEmail() + "\n";
    }
}
