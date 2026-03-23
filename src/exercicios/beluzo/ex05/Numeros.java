package exercicios.beluzo.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);
        
        System.out.println("Digite um número: ");
        int num = sc.nextInt();
        
        if(numeros.contains(num)) {
            System.out.println("O número " + num + " está na lista.");
        } else {
            System.out.println("O número " + num + " não está na lista");
        }
    }
}
