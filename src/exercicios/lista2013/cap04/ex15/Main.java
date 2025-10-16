package exercicios.lista2013.cap04.ex15;

public class Main {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D();
        
        Ponto2D p2 = new Ponto2D();
        
        p1.inicializaPonto(3, 6);
        
        System.out.println(p1.imprimirValor());
        
        p2.inicializaPonto(3, 6);
        
        System.out.println("Igual: " + p1.ehIgual(p2));
        
        p1.origem(p2);
        
        System.out.println(p1.imprimirValor());
        
        System.out.println(p2.imprimirValor());
        
        System.out.println("Igual: " + p1.ehIgual(p2));
        
        p2.clone(p1);
        
        System.out.println(p1.imprimirValor());
        
        System.out.println(p2.imprimirValor());
        
        System.out.println("Igual: " + p1.ehIgual(p2));
        
        
    }
}
