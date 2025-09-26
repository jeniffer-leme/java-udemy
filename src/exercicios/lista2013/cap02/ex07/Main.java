package exercicios.lista2013.cap02.ex07;

public class Main {
    public static void main(String[] args) {
        Lampada l1 = new Lampada(false);
        
        System.out.println("A lâmpada está acesa: " + l1.mostrarEstado());  
        
        l1.apaga();
        System.out.println("A lâmpada está acesa: " + l1.mostrarEstado());
        
        l1.acende();
        System.out.println("A lâmpada está acesa: " + l1.mostrarEstado());
        
    }
}
