package exercicios.arrays_listas.lista.ex01;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        setId(id);
        setNome(nome);
        setSalario(salario);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void aumento(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    @Override
    public String toString() {
        return "\nID: " + getId() + 
                "\nNome: " + getNome() + 
                "\nSalário: " + getSalario() + "\n";
    }
    
}
