package exercicios.lista2013.cap04.ex04;

public class Contador {
    private int contador;

    public Contador() {
        contador = 0;
    }
    
    public Contador(int contador) {
        this.contador = contador;
    }
    
    
    public void zerarValor(){
        contador = 0;
    }
    
    public void incrementarValor(){
        contador++;
    }
    
    public void imprimirValor(){
        System.out.println("Valor: " + contador);
    }
}
