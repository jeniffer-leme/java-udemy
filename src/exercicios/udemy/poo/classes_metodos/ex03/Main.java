package exercicios.udemy.poo.classes_metodos.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Aluno a1 = new Aluno("Alice", 8, 3.9, 7);
        
        System.out.println("------- ALUNO -------");
        System.out.println(a1.toString());
        
        System.out.println("Nota Final: " + a1.Trimestre());
        System.out.println(a1.PassOrFailed());
        
        sc.close();     
    }
}
