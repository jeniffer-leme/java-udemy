package exercicios.lista2013.cap02.ex20;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Rainha Vermelha", "Victoria", 235);
        
        System.out.println("Livro: " + l1.getNome());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Paginas: " + l1.getPaginas());
        
        System.out.println("Tem muitas paginas: " + l1.muitasPaginas());
    }
}
