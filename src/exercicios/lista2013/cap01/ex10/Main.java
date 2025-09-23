package exercicios.lista2013.cap01.ex10;

public class Main {
    public static void main(String[] args) {
        HoraAproximada tempo = new HoraAproximada(15, 39);
        
        System.out.println("A hora é:");
        System.out.println(tempo.getObterHora() + ":" + tempo.getObterMinuto());
        
        System.out.println("-------------------------------------------");
        
        System.out.println("A hora é valida: " + tempo.ehValido(0, 0));
    }

    
}
