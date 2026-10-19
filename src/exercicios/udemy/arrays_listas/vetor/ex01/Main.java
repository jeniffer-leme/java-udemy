package exercicios.udemy.arrays_listas.vetor.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Hospede[] vetor = new Hospede[10];
    
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            
            sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Room: ");
            int room = sc.nextInt();
            
            vetor[room] = new Hospede(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] != null) {
                System.out.println(i + ": " + vetor[i]);
            }
        }
        
        sc.close();
    }
}