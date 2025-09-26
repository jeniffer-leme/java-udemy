package aulas.classe.modificadores.constante;

// depois da criação de objetos da classe Ponto, x e y não são passíveis de alteração
public class Ponto {
    
    //depois de atribuido não se altera mais
    private final double x;
    private final double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

      
    public double getX() {
        return x;
    }

    

    public double getY() {
        return y;
    }

    
    
    
}
