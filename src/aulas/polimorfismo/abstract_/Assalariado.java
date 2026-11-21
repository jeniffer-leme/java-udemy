package aulas.polimorfismo.abstract_;

//Assalariado 'é um' Empregado, pois herda-se de um Empregado
//Assalariado é uma classe concreta, portanto deve implementar todos os métodos abstratos definidos na superclasse e hierarquia
public class Assalariado extends Empregado{
    private double salario;
    
    public Assalariado(String nome, String cpf, double salario){
        super(nome, cpf);
        setSalario(salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("salário deve ser igual ou maior a zero");
        }
    }
    
    @Override
    public double proventoSemanal(){
        return getSalario() / 4.0;
    }
    
}
