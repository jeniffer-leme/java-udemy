package exercicios.udemy.estrutura_sequencial.ex04;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(1, 7, 30);
        Funcionario f2 = new Funcionario(2, 15, 45);
        
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        
        f1.setHora(12);
        
        System.out.println(f1.toString());
    }
}
