package exercicios.lista2013.cap05.ex11;

public class Main {
    public static void main(String[] args) {
        
        double resultado1 = ConversaoDeUnidadesDeArea.areaCampoParaPes();
        double resultado2 = ConversaoDeUnidadesDeArea.areaCampoParaAcre();
        double resultado3 = ConversaoDeUnidadesDeArea.areaCampoParaCm();
        
        System.out.println("O campo de 8250m convertido em pes é: " + resultado1 + " ft²");
        
        System.out.println("O campo de 8250m convertido em acre é: " + resultado2 + " acres");
        
        System.out.println("O campo de 8250m convertido em cm é: " + resultado3 + " c²");
    }
}
