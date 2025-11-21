    package aulas.variavel.composta;

public class ArrayMultiD {
    public static void main(String[] args) {
        
        Ponto[][] matriz = new Ponto[5][];
        
        matriz[0] = new Ponto[5];
        matriz[1] = new Ponto[15];
        
        matriz = new Ponto[5][5];
        
        matriz[2][3] = new Ponto(8.5, 4.1);
        matriz[4][4] = new Ponto(1.5, 3.1);
        
        for(int l = 0; l < matriz.length; l++) { //imprimindo linhas
            for(int c = 0; c < matriz[l].length; c++){ //imprimindo colunas
                if(matriz[l][c] != null) {
                    System.out.print("matriz["+l+"]["+c+"]" + matriz[l][c] + "\t");
                } else {
                    System.out.print("matriz["+l+"]["+c+"]" + "\t");
                }
            }
            System.out.println("\n");
        }
    }
}
