package exercicios.udemy.condicionais.ex06;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        double valor = sc.nextDouble();
        
        if(valor >= 0 && valor <= 25) {
            System.out.println("O n° " + valor + " está no intervalo [0, 25].");
        } else if(valor <= 50) {
            System.out.println("O n° " + valor + " está no intervalo [26, 50].");
        } else if(valor <= 75) {
            System.out.println("O n° " + valor + " está no intervalo [51, 75].");
        } else if( valor <= 100) {
            System.out.println("O n° " + valor + " está no intervalo [76, 100].");
        } else {
            System.out.println("Valor " + valor + " está fora de todos os intervalos.");
        }
        
        sc.close();
    }
}
