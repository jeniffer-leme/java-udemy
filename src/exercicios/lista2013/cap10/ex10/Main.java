package exercicios.lista2013.cap10.ex10;

public class Main {
    public static void main(String[] args) {
        MatrizDeDoubles matriz= new MatrizDeDoubles(2, 2);
        
        matriz.modificarMatriz(0, 0, 3.4);
        System.out.println(matriz.acessarMatriz(0, 0));
        
        
        
    }
}
