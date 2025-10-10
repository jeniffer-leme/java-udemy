package aulas.classe.modificadores.estatico;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(5.0, 3.0);
        Ponto p2 = new Ponto(6.25, 3.25);
        Ponto origem = new Ponto();

        System.out.println(Ponto.getContador());
        
        System.out.println("distancia(p1, p2) = " + CalculadoraPonto.distancia(p1, p2));
        System.out.println("distancia(p1, origem) = " + CalculadoraPonto.distancia(p1, origem));
    }
   
}
