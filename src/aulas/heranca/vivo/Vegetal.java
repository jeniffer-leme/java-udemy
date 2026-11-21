package aulas.heranca.vivo;

public class Vegetal extends SerVivo {

//    private boolean move;
    
//    public SerVivo(boolean move) {...}
//    public boolean isMove() {...}
//    public void setMove(boolean move) {...}
//    public void status() {...}
    
    
    public Vegetal() {
        super(false);
        super.status();
    }
    
    @Override
    public void status(){
        super.status();
        System.out.println("É um vegetal, portanto não se move");
    }
    
    
}
