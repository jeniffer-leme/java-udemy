package aulas.classe.modificadores.finalizado;

public class Main {
    public static void main(String[] args) {
        
        //cria um objeto da classe Ponto na memória da JVM na posição "a6" passível de ser acessado pelo identificador p1 (variável do tipo referência a objetos da classe Ponto)
        Ponto p1 = new Ponto(5.50, 1.25);
    
        System.out.println(p1.getX());
        
        //o acesso ao objeto na posição "a6" é perdido e o Coletor de lixo da JVM irá liberar (mas não se sabe quando) o espaço de memória
        p1 = null;
        
        //Garbage Collector, não há garantia que o Coletor de Lixo será na chamada do ystem.gc()

        System.gc();
    
        
        Ponto p2 = new Ponto(13.50, 0.25);
        p1 = p2;
    }
}
