package exercicios.lista2013.cap05.ex15;

public class Main {
    public static void main(String[] args) {
        
        int resultado1 = ConversaoUnidadeDeTempo.conversaoElefanteDias();
        int resultado2 = ConversaoUnidadeDeTempo.conversaoElefanteHoras();
        int resultado3 = ConversaoUnidadeDeTempo.conversaoElefanteMinutos();
        int resultado4 = ConversaoUnidadeDeTempo.conversaoElefanteSegundos();
        
        System.out.println("A gestacao de um elefante indiano sao: " + resultado1 + " dias");
        System.out.println("A gestacao de um elefante indiano sao: " + resultado2 + " horas");
        System.out.println("A gestacao de um elefante indiano sao: " + resultado3 + " minutos");
        System.out.println("A gestacao de um elefante indiano sao: " + resultado4 + " segundos");
    }
}
