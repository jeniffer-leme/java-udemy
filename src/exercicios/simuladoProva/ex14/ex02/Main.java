package exercicios.simuladoProva.ex14.ex02;

public class Main {
    public static void main(String[] args) {
        Emprestavel e[] = new Emprestavel[3];
        
        e[0] = new LivroFisico("Araraquara", "Aprendendo Java", "Robson", 3, 2017);
        e[1] = new Revista("Dourado", "Aprendendo HTML", "Maria", 4, 2022);
        e[2] = new Chave("A568");
        
        System.out.println(e[0].getNomeObjeto());
        
        System.out.println();
        
        
        System.out.println("Emprestado: " + e[0].emprestar());
        
        System.out.println();
        
        System.out.println("Pode emprestar: " + e[0].podeEmprestar());
        
        System.out.println();
        
        System.out.println("Devolver: " + e[0].devolver());
        
        System.out.println();
        System.out.println(e[0].getNomeObjeto());
        
        System.out.println();
        
        System.out.println(e[2].getNomeObjeto());
        
        System.out.println();
        
        System.out.println("Emprestar: " + e[2].emprestar());
        
        System.out.println();
        
        System.out.println(e[2].getNomeObjeto());
    }
}
