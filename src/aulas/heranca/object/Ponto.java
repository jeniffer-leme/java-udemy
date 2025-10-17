package aulas.heranca.object;

//extends object implícito
//public class Ponto extends Object{
public class Ponto {
    
    private double x, y;

    
    public Ponto() {
        this(0.0, 0.0);
    }

    public Ponto(double x, double y) {
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
    
    @Override
    public String toString(){
        String resultado = "";
        
//        resultado += super.toString() + "\n";
        resultado += "(" + getX() + ", " + getY() + ")";
        
        return resultado;
    }

}
