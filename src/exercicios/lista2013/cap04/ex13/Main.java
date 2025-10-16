package exercicios.lista2013.cap04.ex13;

public class Main {
    public static void main(String[] args) {
        
        NumeroComplexo n1 = new NumeroComplexo();
        
        NumeroComplexo n2 = new NumeroComplexo();
        
        n1.inicializaNumero(3, 7);
        
        n1.imprimirNumero();
        
        n2.inicializaNumero(9, 7);
        
        n2.imprimirNumero();
        
        System.out.println("Igual: " + n1.ehIgual(n2));
        
        n1.soma(n2);
        
        System.out.println("Soma: ");
        
        n1.imprimirNumero();
        
        
    }
}
