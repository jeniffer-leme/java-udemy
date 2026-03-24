package exercicios.beluzo.ex07;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Aluno> aluno = new ArrayList<>();
        
        Aluno a1 = new Aluno("Manu", 22, "Adm");
        Aluno a2 = new Aluno("Raul", 21, "Licenciatura");
        Aluno a3= new Aluno("Evelin", 17, "Engenharia");
        
        aluno.add(a1);
        aluno.add(a2);
        aluno.add(a3);
        
        for(Aluno a : aluno) {
            System.out.println(a);
        }
        
        System.out.println("----------------------");
        
        aluno.removeIf(a -> a.getIdade() < 18);
        
        for(Aluno a : aluno) {
            System.out.println(a);
        }
    }
}
