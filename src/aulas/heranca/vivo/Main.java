package aulas.heranca.vivo;

public class Main {
    public static void main(String[] args) {
        
        Animal a1 = new Animal(true);
        System.out.println(a1.isMove() );
        
        SerVivo s0 = new SerVivo(false);
        s0.status();
        
        Vegetal v1 = new Vegetal();
        v1.status();
        
        s0.status();
        
    }
}
