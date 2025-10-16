package exercicios.lista2013.cap05.ex11;

public class Main {
    public static void main(String[] args) {
        
        double resultado1 = ConversaoDeUnidadesDeArea.converterAreaCampoPes();
        double resultado2 = ConversaoDeUnidadesDeArea.converterAreaCampoAcre();
        double resultado3 = ConversaoDeUnidadesDeArea.converterAreaCampoCm();
        
        System.out.println("O campo de 8250m convertido em pes é: " + resultado1 + " ft²");
        
        System.out.println("O campo de 8250m convertido em acre é: " + resultado2 + " acres");
        
        System.out.println("O campo de 8250m convertido em cm é: " + resultado3 + " c²");
    }
}
