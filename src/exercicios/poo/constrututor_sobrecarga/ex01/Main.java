package exercicios.poo.constrututor_sobrecarga.ex01;

public class Main {
    public static void main(String[] args) {
        Conta c2 = new Conta(245, "Roberto"); 
        
        Conta c1 = new Conta(123, "Julia", 1425.5);
        
        System.out.println("------- CONTA BANCÁRIA -------");
        System.out.println(c1);
        
        c1.saque(145.7);
        
        System.out.println("------- CONTA BANCÁRIA -------");
        System.out.println(c1);
        
        c1.deposito(10);
        
        System.out.println("------- CONTA BANCÁRIA -------");
        System.out.println(c1);
    }
}
