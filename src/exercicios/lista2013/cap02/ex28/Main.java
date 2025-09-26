package exercicios.lista2013.cap02.ex28;

public class Main {
        public static void main(String[] args) {
        Lampada l1 = new Lampada(false, 30);
        
        System.out.println("A lâmpada está acesa: " + l1.mostrarEstado());  
        
        l1.apaga();
        System.out.println("A lâmpada está acesa: " + l1.mostrarEstado());
        
        l1.acende();
        System.out.println("A lâmpada está acesa: " + l1.mostrarEstado());
        
        System.out.println("A lâmpada é econômica: " + l1.ehEconomica());
        
        System.out.println("A lampada foi acesa " + l1.incrementarContador() + " vezes.");
    }
}
