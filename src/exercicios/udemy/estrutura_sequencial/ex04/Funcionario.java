package exercicios.udemy.estrutura_sequencial.ex04;

public class Funcionario {
    private int id;
    private int hora;
    private double valor;
    private double salario;

    public Funcionario(int id, int hora, double valor) {
        setId(id);
        setHora(hora);
        setValor(valor);
    }

    public int getId() {
        return id;
    }

    public int getHora() {
        return hora;
    }

    public double getValor() {
        return valor;
    }

    public double getSalario() {
        return getHora() * valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHora(int hora) {
        if(hora <= 24) { 
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("O tempo é somente até 24h.");
        }
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + 
                "\nHora: " + getHora() + 
                "\nValor: " + getValor() +
                "\nSalário: " + getSalario() + "\n";
    }
    
    
}
