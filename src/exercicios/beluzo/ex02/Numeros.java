package exercicios.beluzo.ex02;

import java.util.ArrayList;
import java.util.List;

public class Numeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        
        System.out.println("Primeiro elemento: " + numeros.get(0));
        System.out.println("Último elemento: " + numeros.get(9));
        System.out.println("Quinto elemento: " + numeros.get(5));
    }
    
}
