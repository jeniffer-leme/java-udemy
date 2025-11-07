package exercicios.simuladoProva.ex07;

public class Main {
    public static void main(String[] args) {
        Data d1 = new Data(22, 04, 2005);
        Data d2 = new Data(22, 01, 2014);
        
        System.out.println(d1.mostrarData());
        
        System.out.println("A data " + d1.mostrarData() + " vem antes da " + d2.mostrarData() + ": " + d2.vemAntes(d2));
        
        System.out.println("A data " + d1.mostrarData() + " é ano bissexto " + ": " + d1.eBissexto());
    }
}
