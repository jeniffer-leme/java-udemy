package aulas.heranca.vivo;

/*
Subclasse de  SerVivo.

Animal tem um relacionamento "é um" SerVivo.

Animal herda de SerVivo, dispondo de seus membros e modificadores de acesso.
*/

public class Animal extends SerVivo {
    
//    private boolean move;
    
//    public SerVivo(boolean move) {...}
//    public boolean isMove() {...}
//    public void setMove(boolean move) {...}
//    public void status() {...}

    
    public Animal(boolean move) {
        super(move);
    }
    
    public void statusAnimal(){
    //move é privado e só é acessado diretamente na classe SerVivo
//        if(move == true) {
        if(isMove() == true){
            System.out.println("É um ser vivo que se move.");
        } else {    
            System.out.println("É um ser vivo que não se move.");
        }
    }    
}
