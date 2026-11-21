package aulas.colecao.linkedList;

//EXEMPLO DE LISTA USANDO LINKEDLIST COM LIST
//Vantagens - Inserir/remover → rápido (principalmente no início/meio)
//Desvantagens - Acessar por índice → lento (tem que percorrer)
//Uso de MEMÓRIA MAIOR
//10 → 20 → 30 → 40
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new LinkedList<>();

        //Adicionando Elementos
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Marina");

        //Retorna o elemento da posição indicada
        System.out.println("-----------------------------------");
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        System.out.println(nomes);
        
        //Removendo Elemento
        //Os elementos seguintes são reposicionados
        System.out.println("-----------------------------------");
        System.out.println(nomes.get(1));
        nomes.remove(1);
        System.out.println(nomes.get(1));
        System.out.println(nomes);
        
        //Tamanho da Lista
        System.out.println("-----------------------------------");
        System.out.println(nomes.size());
        
        //Percorrendo Lista
        System.out.println("-----------------------------------");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
    }
    
}
