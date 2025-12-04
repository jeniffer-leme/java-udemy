package exercicios.simuladoProva.ex14.ex01;

public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz(3, 13.5);
        System.out.println( m );
        
        m.subtrairElementoMatriz(2.5);
        System.out.println( m );
        
        m.setValor(1, 1, 99.5);
        
        System.out.println( m.determinanteDaMatriz() );
        System.out.println( m.maiorNumero());
        
    }
}
    

