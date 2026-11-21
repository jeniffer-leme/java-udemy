package aulas.colecao.listinha;
import java.util.ArrayList;

//EXEMPLO COM ARRAYLIST SEM LIST
//Principais operações de uma lista
public class MinhaLista {
    private ArrayList<String> lista;

    // Construtor
    public MinhaLista() {
        lista = new ArrayList<>();
    }

    //1. Adicionar elemento
    public void adicionar(String elemento) {
        lista.add(elemento);
    }

    //2. Remover elemento pelo índice
    public void remover(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    //3. Acessar elemento por índice
    public String acessar(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            return lista.get(indice);
        } else {
            return "Índice inválido!";
        }
    }

    //4. Verificar tamanho da lista
    public int tamanho() {
        return lista.size();
    }

    //5. Iterar pelos elementos
    public void mostrarElementos() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posição " + i + ": " + lista.get(i));
        }
    }
}

