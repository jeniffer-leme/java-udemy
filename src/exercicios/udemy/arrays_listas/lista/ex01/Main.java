package exercicios.udemy.arrays_listas.lista.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Funcionario> list = new ArrayList();
    
        System.out.print("Digite a quantidade de funcionarios: ");
        int func = sc.nextInt();
        
        for(int i = 0; i < func; i++) {
            System.out.println();
            System.out.println("Funcionário " + (i + 1));
            
            System.out.print("ID: ");
            int id = sc.nextInt();
        
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            
            Funcionario employee = new Funcionario(id, nome, salario);
            
            list.add(employee);
        }
        
        System.out.print("\nDigite o ID do funcionário que deseja aumentar o salário: ");
        int idSalario = sc.nextInt();
        
        int pos = posicao(list, idSalario);
        
        if(pos == -1) { 
            System.out.println("Esse funcionário não existe.");
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            
            list.get(pos).aumento(porcentagem);
        }
        
        System.out.println("\n========= FUNCIONARIOS =========");
        for(Funcionario employee : list) {
            System.out.println(employee);
        }
        
        sc.close(); 
    }
    
    public static int posicao(List<Funcionario> list, int id) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) { 
                return i;
            }
        }
        
        return -1;
    }
}
