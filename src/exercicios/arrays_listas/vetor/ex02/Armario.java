package exercicios.arrays_listas.vetor.ex02;

public class Armario {
    public String nome;
    public String matricula;

    public Armario(String nome, String matricula) {
        setNome(nome);
        setMatricula(matricula);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() +
                "\nMatrícula: " + getMatricula() + "\n";
    }
}
