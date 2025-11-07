package aulas.polimorfismo.interface_;

//Assalariado tem um relacionamento de "é um" com Empregado e Pagavel
public class Assalariado extends Empregado {
    private double salario; //salario mensal

    public Assalariado(String nome, double salario) {
        super(nome);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("O salário deve ser maior do que 0");
        }
    }
    
    public double proventoSemanal(){
        return getSalario() / 4.0;
    }
    
    @Override
    public String getDescricao() {
        return "Empregado Assalariado.";
    }
    
}
