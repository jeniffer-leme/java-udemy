package aulas.variavel.composta;

public class OperadorArray {
    
    private OperadorArray() {
        
    }
    
    public static int soma(int[] vetor) {
        int resultado = 0;
        
        for(int numero : vetor) {
            resultado += numero;
        }
        
        return resultado;
    }
    
    public static void soma(int escalar, int[] vetor) {
        for(int indice = 0; indice < vetor.length; indice++) {
            vetor[indice] += escalar;
        }
    }
    
    public static boolean comparar(int[] a, int[] b) {
        if(a.length != b.length) {
            return false;
        }
        
        for(int indice = 0; indice < a.length; indice++) {
            if(a[indice] != b[indice]) {
                return false;
            }
        }
        return true;
    }
    
    
}
