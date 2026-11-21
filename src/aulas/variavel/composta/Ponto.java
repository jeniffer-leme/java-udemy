package aulas.variavel.composta;

public class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this(0.0, 0.0);
    }

    public Ponto(double x, double y) {
        setX(x);
        setY(y);
        int aux = (int)x;
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
    
    public void mostrarPonto() {
        System.out.print(toString());
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
