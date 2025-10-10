package aulas.classe.metodos.sobrecarga;

public class Main {
    public static void main(String[] args) {
        
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(5.0, 3.0);
        
        System.out.println("p2.getX() = " + p2.getX());
        
        p2.setX(13.5);
        System.out.println("p2.getX() = " + p2.getX());
        
        p2.SetX();
        System.out.println("p2.getX() = " + p2.getX());
        
        p2.SetX("9.25");
        System.out.println("p2.getX() = " + p2.getX());
    }
}
