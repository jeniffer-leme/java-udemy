package exercicios.simuladoProva.ex12;

public class Ponto3D {
    private double x;
    private double y;
    private double z;

    public Ponto3D(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public double getDistancia(Ponto3D outro) {
        return Math.sqrt(
                Math.pow(getX() - outro.getX(), 2) + 
                Math.pow(getY() - outro.getY(), 2) + 
                Math.pow(getZ() - outro.getZ(), 2)
        );
    }
    
    public Ponto3D getPontoMedio(Ponto3D outro) {
        double pontoMedio1 = (getX() + outro.getX()) / 2;
        double pontoMedio2 = (getY() + outro.getY()) / 2;
        double pontoMedio3 = (getZ() + outro.getZ()) / 2;
         
        return new Ponto3D(pontoMedio1, pontoMedio2, pontoMedio3);
    }
}
