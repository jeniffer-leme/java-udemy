package exercicios.simuladoProva.ex14.ex01;

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(2);
        
        matriz.alterarMatriz(0, 0, 4.3);
        matriz.alterarMatriz(0, 1, 3.5);
        matriz.alterarMatriz(1, 0, 2.5);
        matriz.alterarMatriz(1, 1, 1.5);
        
        
        System.out.println();
        
        matriz.somaElementoMatriz(4.5);
        
        
        System.out.println();
        
        matriz.subtrairElementoMatriz(1.0);
        
        
        System.out.println();
        
        System.out.println(matriz.maiorNumero());
        
        System.out.println();
        
        System.out.println(matriz.menorNumero());
        
        System.out.println(); 
        
        System.out.println(matriz.toString());
    }
    
}
