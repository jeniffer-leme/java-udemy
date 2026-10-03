package exercicios.udemy.poo.classes_metodos.ex02;

public class Funcionario {
    public String nome;
    public double salarioBruto; 
    public double imposto;
    
    public double SalarioLiquido() {
        return salarioBruto - imposto;
    }
    
    public double AumentarSalario(double porcentagem) {
        return salarioBruto += (imposto * porcentagem) / 100;
    }

    @Override
    public String toString() {
        return "Nome " + nome + 
                "\nSalário Bruto: " + salarioBruto + 
                "\nImposto: " + imposto + "\n";     
                
    }
    
    
}
