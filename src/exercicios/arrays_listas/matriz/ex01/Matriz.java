package exercicios.arrays_listas.matriz.ex01;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o tamanho da matriz: ");
        int n = sc.nextInt();
        
        System.out.print("Digite os valores da matriz: ");
        int[][] matriz = new int[n][n];
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        

        System.out.println("\n======== MATRIZ ========");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println();
        }
        
        
        System.out.println("\n======= DIAGONAL PRINCIPAL =======");
        for(int i = 0; i < matriz.length; i++) {
            System.out.print("[ " + matriz[i][i] + " ] ");
        }   
        
        
        int count = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] < 0) {
                    count++;
                }
            }
        }
        
        System.out.println("\n\nQuantia de valores negativos: " + count);
        
        sc.close();
    }
}
