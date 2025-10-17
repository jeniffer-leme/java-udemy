package aulas.heranca.vivo;

/*
Super Classe | Classe Básica | Classe Base
*/

public class SerVivo {
    
    private boolean move;
    
    //está implícito (caso não se defina o construtor padrão) o construtor padrão que atribui falso para a variável 'move'
//    public SerVivo() {
//    }

    public SerVivo(boolean move) {
        setMove(move);
    }
    

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }
    
    public void status(){
        if(move == true) {
            System.out.println("É um ser vivo que se move.");
        } else {    
            System.out.println("É um ser vivo que não se move.");
        }
    }  
}
