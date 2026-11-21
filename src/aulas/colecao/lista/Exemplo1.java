package aulas.colecao.lista;

import java.util.ArrayList;
import aulas.variavel.composta.Ponto;

public class Exemplo1 {
    public static void main(String[] args) {
        
        //está implícito <Object>
//        ArrayList <Object> numeros = new ArrayList();
        ArrayList numeros = new ArrayList();
        
        numeros.add(5);
        numeros.add(2);
        numeros.add(3);
        numeros.add(1951);
        numeros.add(13);
        numeros.add(1988);
        
        System.out.println(numeros);
        
        numeros.add(2, 8);
        
        System.out.println(numeros);
        System.out.println(numeros.contains(13));
        System.out.println(numeros.contains(51));
        
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("maçã");
        palavras.add("mamão");
        palavras.add("uva");
        palavras.add("pera");
        
        System.out.println(palavras);
        System.out.println(palavras.indexOf("mamão"));
        System.out.println(palavras.indexOf("uva"));
        System.out.println(palavras.indexOf("abacaxi"));
        
        String palavra = palavras.get(3);
        System.out.println(palavra);
        
        ArrayList<Ponto> pontos = new ArrayList<>();
        
        pontos.add(new Ponto(8.5, 10.0));
        pontos.add(new Ponto(7.5, 2.0));
        pontos.add(new Ponto(0.5, 10.0));
        
        System.out.println(pontos);
        
        for(Ponto p : pontos) {
            p.mostrarPonto();
            p.setX(0.0);
            p.setY(0.0);
            p.mostrarPonto();
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println(pontos);
        
        pontos.clear();
        System.out.println(pontos);
    }
}
