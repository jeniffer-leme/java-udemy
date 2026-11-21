package aulas.variavel.composta;

import java.util.Arrays;

public class ArrayUniD {
    public static void main(String[] args) {
        
        final int TAMANHO = 15;
        
        int[] vetor; 
        vetor = new int[15];
        vetor = new int[TAMANHO];
        
        System.out.println(vetor.length);
        
        System.out.println(vetor[0]);
//        System.out.println(vetor[15]); erro (ArrayIndexOutOfBoundsException)
        
        System.out.println("Índice \t Valor");
        for(int i = 0; i <= vetor.length - 1; i++) {
            System.out.println(i + "\t" + vetor[i] + "\n");
        }
        
        System.out.println("----------------------------");
        
        System.out.println("Índice \t Valor");
        for(int i = 0; i <= vetor.length - 1; i++) {
            vetor[i] += 1;
            System.out.println(i + "\t" + vetor[i] + "\n");
        }
        
        System.out.println("----------------------------");
        
        for(int i : vetor) {
            System.out.println(i);
        }
        
        System.out.println("----------------------------");
        
        System.out.println(OperadorArray.soma(vetor));
        
        OperadorArray.soma(1, vetor);
        
        System.out.println(OperadorArray.soma(vetor));
        
        int[] vetor2 = new int[5]; //5 posições 0..4 com o valor 0
        int[] vetor3 = new int[15]; ////15 posições 0..14 com o valor 0
        
        System.out.println("OperadorArray.comparar(vetor2, vetor3: " + OperadorArray.comparar(vetor2, vetor3));
        
        OperadorArray.soma(2, vetor3);
        
        System.out.println("OperadorArray.comparar(vetor2, vetor3: " + OperadorArray.comparar(vetor, vetor3));
        
        System.out.println("----------------------------");
        
        Arrays.fill(vetor2, 3);
        
        System.out.println("Índice \t Valor");
        for(int i = 0; i < vetor2.length; i++) {
            System.out.println(i + "\t" + vetor2[i] + "\n");
        }
        
        System.out.println(OperadorArray.soma(vetor2));
        
        System.out.println("----------------------------");
        
        Ponto[] pontos = new Ponto[5]; //5 posições 0..4 com valor null
        
        System.out.println("Índice \t Valor");
        for(int i = 0; i < pontos.length; i++) {
            System.out.println(i + "\t" + pontos[i] + "\n");
        }
        
        pontos[1] = new Ponto(13.5, 8.5);
        Ponto p = new Ponto(9.5, 1.5);
        pontos[3] = p;
        
        System.out.println("Índice \t Valor");
        for(int i = 0; i < pontos.length; i++) {
            System.out.println(i + "\t");
            
            if(pontos[i] != null) {
               pontos[i].mostrarPonto(); 
            } else {
                System.out.println("nulo (null)");
            }
            
            System.out.println("\n");
        }
        
        
    }
}
