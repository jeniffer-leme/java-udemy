package exercicios.simuladoProva.ex11;

public class Main {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(2, 4);
        Ponto2D p2 = new Ponto2D(7, 1);
        
        System.out.println(p1.estaADireitaDe(p2));
        
        System.out.println(p1.estaAEsquerdaDe(p2));
        
        System.out.println(p1.estaAbaixoDe(p2));
        
        System.out.println(p1.estaAcimaDe(p2));
    }
}
