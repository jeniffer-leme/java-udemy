package aulas.classe.metodos.predicados;

public class Ponto {
    private double x;
    private double y;
    private boolean xPositivo;
    private boolean yPositivo;

    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        if(this.x >= 0){
            setxPositivo(true);
        } else {
            setxPositivo(false);
        }
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        if(this.y >= 0){
            setyPositivo(true);
        } else {
            setyPositivo(false);
        }
    }

    public boolean isxPositivo() {
        return xPositivo;
    }

    private void setxPositivo(boolean xPositivo) {
        this.xPositivo = xPositivo;
    }

    public boolean isyPositivo() {
        return yPositivo;
    }

    private void setyPositivo(boolean yPositivo) {
        this.yPositivo = yPositivo;
    }
    
    
}
