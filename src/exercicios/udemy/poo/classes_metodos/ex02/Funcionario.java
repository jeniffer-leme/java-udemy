package exercicios.udemy.poo.classes_metodos.ex02;

public class Funcionario {
    public String nome;
    public double salarioBruto; 
    public double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        setNome(nome);
        setSalarioBruto(salarioBruto);
        setImposto(imposto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    
    
    public double SalarioLiquido() {
        return salarioBruto - imposto;
    }
    
    public double AumentarSalario(double porcentagem) {
        return salarioBruto += (imposto * porcentagem) / 100;
    }

    @Override
    public String toString() {
        return "Nome " + nome + 
                "\nSalário Bruto: $" + salarioBruto + 
                "\nSalário Líquido: $" + SalarioLiquido() + 
                "\nImposto: $" + imposto + "\n";     
                
    }
    
    
}
