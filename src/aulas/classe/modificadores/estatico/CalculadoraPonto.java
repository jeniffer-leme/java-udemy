package aulas.classe.modificadores.estatico;

public class CalculadoraPonto {
    
    private void CalculadoraPonto() {
    
    }
    
    public static double distancia(Ponto a, Ponto b){
        double resultado;
        double difX, difY;
        
        difX = a.getX() - b.getX();
        difY = a.getY() - b.getY();
        
        resultado = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2) );
        
        return resultado;
    }
}
