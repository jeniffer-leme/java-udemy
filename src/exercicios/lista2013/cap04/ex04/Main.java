package exercicios.lista2013.cap04.ex04;

public class Main {
    public static void main(String[] args) {
        
        Contador c1 = new Contador();
        
        Contador c2 = new Contador(7);
        
        c1.incrementarValor();
        c1.imprimirValor();
        
        c2.incrementarValor();
        c2.imprimirValor();
    }
}
