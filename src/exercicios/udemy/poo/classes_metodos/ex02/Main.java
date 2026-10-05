package exercicios.udemy.poo.classes_metodos.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            Funcionario f1 = new Funcionario("Gustavo", 6000, 248);
            
            System.out.println("-------- FUNCIONÁRIO --------");
            System.out.println(f1.toString());
            
            System.out.print("\nPorcentagem de Acréscimo: ");
            double acrescimo = sc.nextDouble();
            
            System.out.println("\n-------- REAJUSTE FUNCIONÁRIO --------");
            System.out.println(f1.toString());
            System.out.println("Novo Salário: $" + f1.AumentarSalario(acrescimo));
            
            sc.close();
    }
}
