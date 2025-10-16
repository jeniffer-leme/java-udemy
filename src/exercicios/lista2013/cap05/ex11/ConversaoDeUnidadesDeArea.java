package exercicios.lista2013.cap05.ex11;

public class ConversaoDeUnidadesDeArea {
    private static double metros = 8250.0;
    private static double pes = 10.76;
    
    
    public static double convertorMetrosPés(double metros){
        return metros * 10.76;
    }
    
    public static double convertorPesCent(double pes){
        return pes * 929.0;
    }
    
    public static double converterMilhasAcres(double milhas){
        return milhas * 640.0;
    }
    
    public static double converterAcrePes(double acres){
        return acres * 43.560;
    }
    
    public static double converterAreaCampoPes(){
        return metros * pes;
    }
    
    public static double converterAreaCampoAcre(){
        double converter = metros * pes;
        return converter / 43560.0;
    }
    
    public static double converterAreaCampoCm(){
        return metros * 10000;
    }
}
