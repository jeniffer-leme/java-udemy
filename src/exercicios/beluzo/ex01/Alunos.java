package exercicios.beluzo.ex01;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();   
    
        nomes.add("Camilla");
        nomes.add("Gustavo");
        nomes.add("Victor");
        nomes.add("Maria");
        nomes.add("Alef");
        
        System.out.println("Alunos disponíveis:");
        for(String nome : nomes) {
            System.out.println(nome);    
       }   
        
        System.out.println("-----------------------------------");
        nomes.remove("Alef");
        
        System.out.println("Alunos disponíveis: ");
        for(String nome : nomes) {
            System.out.println(nome);
        }
        
        System.out.println("-----------------------------------");
        System.out.println("Tamanho da Lista: " + nomes.size());
        
    }
}
