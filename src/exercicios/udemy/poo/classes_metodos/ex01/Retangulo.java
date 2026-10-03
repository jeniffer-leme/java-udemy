package exercicios.udemy.poo.classes_metodos.ex01;

public class Retangulo {
    public double altura;
    public double largura;
    
    public double Area() {
        return largura * altura;
    }
    
    public double Perimetro() {
        return 2 * (largura + altura); 
    }
    
    public double Diagonal() {
        return Math.sqrt((Math.pow(altura, 2.0)) + (Math.pow(largura, 2.0)));
    }
}
