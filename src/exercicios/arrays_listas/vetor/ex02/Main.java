package exercicios.arrays_listas.vetor.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Armario[] vetor = new Armario[12];
        
        System.out.print("Digite a quantidade de armários a serem usados: ");
        int quantidade = sc.nextInt();
        
        for (int i = 1; i <= quantidade; i++) {
            System.out.println();
            System.out.println("Armario " + i + ":");
            
            sc.nextLine(); 
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();
            
            System.out.print("Armário: ");
            int room = sc.nextInt();
            
            vetor[room] = new Armario(nome, matricula);
        }
        
        
        System.out.println();
        System.out.println("======= ARAMARIOS OCUPADOS =======");
        
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] != null) {
                System.out.println("Cadastro " + i + ": " + vetor[i]);
            }
        }

        sc.close();
    }
}
