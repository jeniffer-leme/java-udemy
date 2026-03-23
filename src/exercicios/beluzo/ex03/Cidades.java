package exercicios.beluzo.ex03;

import java.util.LinkedList;
import java.util.List;

public class Cidades {
    public static void main(String[] args) {
        List<String> cidade = new LinkedList<>();
        
        cidade.add("Araraquara");
        cidade.add("Guarulhos");
        cidade.add("Porto Rico");
        cidade.add("Salvador");
        
        for(String cidades : cidade) {
            System.out.println(cidades);
        }
        
        cidade.add(2, "Nova York");
        
        System.out.println("-----------------------------------");
        for(String cidades : cidade) {
            System.out.println(cidades);
        }
    }
}
