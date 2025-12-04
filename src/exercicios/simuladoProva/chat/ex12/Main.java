package exercicios.simuladoProva.chat.ex12;

public class Main {
    public static void main(String[] args) {
        
        Ponto2D p = new Ponto2D(2.7, 4.7);
        Ponto2D q = new Ponto2D(4.7, 8.7);
        Ponto2D r = new Ponto2D(1.7, 8.4);
        
        RotaUrbana ru = new RotaUrbana(123, p, q);
        RotaUrbana ru1 = new RotaUrbana(123, p, r);
        RotaRodoviaria rr = new RotaRodoviaria(456, p, q, 11.20);
        
        System.out.println(ru.getCalcularCusto());
        
        System.out.println();
        
        System.out.println(ru1.getCalcularCusto());
        
        System.out.println();
        
        System.out.println(rr.getCalcularCusto());
        
        System.out.println();
        
        System.out.println(ru.toString());
    }
}
