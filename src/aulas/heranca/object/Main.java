package aulas.heranca.object;

public class Main {
    public static void main(String[] args) {
        
        Ponto p = new Ponto(13.5, 5.25);
        
        //toString é um método definido na classe base Object
        System.out.println(p.toString());
        
        System.out.println(p);
        
        Object obj;
        
        //Uma variável do tipo SuperClasse pode acessar um objeto de Subclasse
        obj = p;
        
        System.out.println(p.getX());
        System.out.println(p.getClass());
        System.out.println(p.toString());
        
        //Uma variável do tipo object tem acesso aos membros definidos na classe Object
//        System.out.println(obj.getX());
        System.out.println(obj.getClass());
        System.out.println(obj.toString());
        
        System.out.println("###");
        
        p.setX(88.7);
        System.out.println(obj.toString());
    }
}
