package aulas.classe.modificadores.estatico;

public class Ponto {
    private double x, y;
    private static int contador;

    public Ponto() {
        this(0.0, 0.0);
    }
   
    public Ponto(double x, double y) {
        setX(x);
        setY(y);
        contador++;
    }

    public static int getContador() {
        return contador;
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
