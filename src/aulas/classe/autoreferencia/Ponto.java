package aulas.classe.autoreferencia;

public class Ponto {
    private double x;
    private double y;

    //implícito o construtor padrão (a JVM cria o construtor sem argumentos)
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        //o argumento x do método está sombreando o atributo da classe x e portanto é necessário utilizar a instrução de autoreferência
        this.x = x;
    }

    public double getY() {
         return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    

}