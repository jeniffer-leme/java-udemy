package exercicios.lista2013.cap04.ex15;

public class Ponto2D {
    private double x, y;

    public Ponto2D() {
    }

    public Ponto2D(double x, double y) {
        setX(x);
        setY(y);
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
    
    public void inicializaPonto(double x, double y){
        setX(x);
        setY(y);
    }
    
    public boolean ehIgual(Ponto2D num){
        if(this.getX() == num.getX() && this.getY() == num.getY()){
            return true;
        } else {
            return false;
        }
    }
    
    public void origem(Ponto2D num){
        num.setX(0);
        num.setY(0);
    }
    
    public void clone(Ponto2D num){
        num.setX(getX());
        num.setY(getY());
    }
    
    public String imprimirValor(){
        String resultado = "X: " + getX() + " Y: " + getY();
        return resultado;
    }
    
}
