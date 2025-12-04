package exercicios.simuladoProva.chat.ex02;

public class Main {
    public static void main(String[] args) {
        Emprestavel e[] = new Emprestavel[3];
        
        e[0] = new Chave("A23");
        
        System.out.println(e[0].getNomeObjeto());
        
        System.out.println();
        
        System.out.println(e[0].podeEmprestar());
        
        System.out.println();
    
        System.out.println(e[0].emprestar());
        
        System.out.println(e[0].devolver());
        
        System.out.println(e[0].getNomeObjeto());
    }
}
