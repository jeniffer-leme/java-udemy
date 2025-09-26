package exercicios.lista2013.cap02.ex23;

public class Main {
    public static void main(String[] args) {
        Contador c1 = new Contador(0);
        
        System.out.println("Contador atual: " + c1.getContagem());
        
        c1.zerarConatador();
        System.out.println("Contador zerado: " + c1.getContagem());
        
        c1.incrementarContador(7);
        System.out.println("Contador incrementado: " + c1.getContagem());
        
        c1.incrementarContador(2);
        System.out.println("Contador incrementado: " + c1.getContagem());
        
        c1.zerarConatador();
        System.out.println("Contador zerado: " + c1.getContagem());
        
        c1.incrementarContador(1);
        System.out.println("Contador incrementado: " + c1.getContagem());
        
        c1.imprimirValor();
        System.out.println("O atual valor é: " + c1.getContagem());
    }
}
