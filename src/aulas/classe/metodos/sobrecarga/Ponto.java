package aulas.classe.metodos.sobrecarga;

public class Ponto {
    
    //assumindo que x e y podem assumir quaisquer valores reais e são passíveis de alteração
    private double x; 
    private double y;

    //sobrecarga de construtor
    public Ponto(){
        this(0.0, 0.0); //só pode possuir uma instrução
    }
    
    public Ponto(double x, double y) {
        setX(x);
        setY(y);
        System.out.println(getX() + "" + getY());
    }
 
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
}
