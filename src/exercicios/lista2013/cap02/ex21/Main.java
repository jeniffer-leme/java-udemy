package exercicios.lista2013.cap02.ex21;

public class Main {
    public static void main(String[] args) {
        LivroLivraria l1 = new LivroLivraria("Dom Casmurro", "Machado de Assis", 167, 27.78, 15, 2222);
        
        System.out.println("Informções do Livro:");
        System.out.println();
        
        System.out.println("Livro: " + l1.getNome());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Paginas: " + l1.getPaginas());
        System.out.println("Preço: " + l1.getPreco());
        System.out.println("Estoque: " + l1.getEstoque());
        System.out.println("Código: " + l1.getCodigo());
        System.out.println("É possível vender o livro: " + l1.venderLivro(7));
    }
}
