package aulas.classe.metodos.pilha;

public class Classe {
    
    public void metodoA(){
        metodoB();
        System.out.println("metodoA()");
    }
    
    public void metodoB(){
        metodoC();
        System.out.println("metodoB()");
    }
    public void metodoC(){
        metodoD();
        System.out.println("metodoC()");
        System.out.println(5 / 0);
    }
    
    public void metodoD(){
        System.out.println("metodoD()");
        System.out.println(5.0 / 0.0);
    }
}
