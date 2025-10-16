package exercicios.lista2013.cap04.ex19;

public class Main {
    public static void main(String[] args) {
        Linha l1 = new Linha();
        
        Ponto2D p1 = new Ponto2D(4.0, 7.0);
        
        Ponto2D p2 = new Ponto2D(3.0, 8.0);
        
        Linha l2 = new Linha(p1, p2);
        
        System.out.println("X: " + l1.getX());
        System.out.println("Y: " + l1.getY());
        
        System.out.println("X: " + l2.getX());
        System.out.println("Y: " + l2.getY());
        
        /*System.out.println("X: " + l1.getX());
        System.out.println("Y: " + l1.getY());*/
        
        
        //MAIN CONFUSO
    }
}
