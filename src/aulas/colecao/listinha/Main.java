package aulas.colecao.listinha;

public class Main {
    public static void main(String[] args) {

        MinhaLista lista = new MinhaLista();

        // Adicionar elementos
        lista.adicionar("Maçã");
        lista.adicionar("Banana");
        lista.adicionar("Laranja");

        // Mostrar lista
        lista.mostrarElementos();

        // Acessar elemento
        System.out.println("Elemento na posição 1: " + lista.acessar(1));

        // Tamanho
        System.out.println("Tamanho da lista: " + lista.tamanho());

        // Remover elemento
        lista.remover(1);

        // Mostrar novamente
        System.out.println("Após remover:");
        lista.mostrarElementos();
    }
}
    

