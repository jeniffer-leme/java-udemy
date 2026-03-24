package exercicios.beluzo.ex09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        
        nomes.add("Maria");
        nomes.add("Lucas");
        nomes.add("Luis");
        nomes.add("Ana");
        nomes.add("Marcela");
        nomes.add("Marcelina");
        
        System.out.println("Desordenada:");
        for(String n : nomes) {
            System.out.println(n); 
        }
        
        System.out.println("--------------------------------");
        
        System.out.println("Ordenada:");
        Collections.sort(nomes); 
        
        for(String n : nomes) {
            System.out.println(n); 
        }
    }
}
