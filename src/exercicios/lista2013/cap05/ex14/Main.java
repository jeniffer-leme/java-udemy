package exercicios.lista2013.cap05.ex14;

public class Main {
    public static void main(String[] args) {
        
        int resultado1 = ConversaoUnidadeDeTempo.conversaoMinuto(2);
        int resultado2 = ConversaoUnidadeDeTempo.conversaoHora(5);
        int resultado3 = ConversaoUnidadeDeTempo.conversaoDia(3);
        int resultado4 = ConversaoUnidadeDeTempo.conversaoSemana(6);
        int resultado5 = ConversaoUnidadeDeTempo.conversaoMes(4);
        double resultado6 = ConversaoUnidadeDeTempo.conversaoAno(7);
        
        System.out.println("2min tem: " + resultado1 + " segundos.");
        
        System.out.println("5h tem: " + resultado2 + " minutos.");
        
        System.out.println("3 dia tem: " + resultado3 + " horas.");
        
        System.out.println("6 semanas tem: " + resultado4 + " dias.");
        
        System.out.println("4 meses tem: " + resultado5 + " semanas.");
        
        System.out.println("7 anos tem: " + resultado6 + " dias.");
    }
}
