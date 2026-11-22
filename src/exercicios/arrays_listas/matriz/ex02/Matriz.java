package exercicios.arrays_listas.matriz.ex02;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de linhas: ");
        int m = sc.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int n = sc.nextInt();

        System.out.print("Digite os valores da matriz: ");
        int[][] matriz = new int[m][n];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        
        
        System.out.println("\n======== MATRIZ ========");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print("[ " + matriz[i][j] + " ] ");
            }
            System.out.println();
        }
        
        
        System.out.print("\nDigite um valor: ");
        int x = sc.nextInt();
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(x == matriz[i][j]) {
                    System.out.println("Posição: [ " + i + " ] " + "[ " + j + " ] ");
                    
                    if(j > 0) {
                    System.out.println("Esquerda: [ " + matriz[i][j-1] + " ]" );
                    }
                
                    if(i > 0) {
                        System.out.println("Acima: [ " + matriz[i-1][j] + " ]" );
                    }
                    
                    if(j < matriz[i].length-1) {
                        System.out.println("Direita: [ " + matriz[i][j+1] + " ]" );
                    }
                    
                    if(i < matriz.length-1) {
                        System.out.println("Abaixo: [ " + matriz[i+1][j] + " ]" );
                    }
                    
                }
                
                
            }
        }
        
        
        sc.close();
    }
}
