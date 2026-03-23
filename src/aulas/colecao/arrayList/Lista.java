package aulas.colecao.arrayList;

//EXEMPLO DE LISTA USANDO ARRAYLIST COM LIST
//Vantagens - Acesso por índice é muito rápido
//Desvantagens - Inserir/remover no meio → lento (tem que “empurrar” elementos)
//Uso de MEMÓRIA MENOR
//[10] [20] [30] [40]
import java.util.List;
import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

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
