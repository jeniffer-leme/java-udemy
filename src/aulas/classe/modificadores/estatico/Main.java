package aulas.classe.modificadores.estatico;

public class Main {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        Ponto p3 = new Ponto();

        System.out.println(Ponto.getContador());
    }
   
}
