package exercicios.lista2013.cap05.ex10;

public class Main {
    public static void main(String[] args) {
        double resultado1 = ConversaoDeUnidadesDeArea.convertorMetrosPés(1);
        double resultado2 = ConversaoDeUnidadesDeArea.convertorPesCent(1);
        double resultado3 = ConversaoDeUnidadesDeArea.converterMilhasAcres(1);
        double resultado4 = ConversaoDeUnidadesDeArea.converterAcrePes(3);
        
        System.out.println("1 metros tem " + resultado1 + " ft²");
        
        System.out.println("1 pes tem " + resultado2 + " cm².");
        
        System.out.println("1 milha tem " + resultado3 + " acres.");
        
        System.out.println("3 acre tem " + resultado4 + " pes².");
        
        
    }
}
