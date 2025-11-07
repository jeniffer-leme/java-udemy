package exercicios.lista2013.cap08.ex08;

public class LampadaFluorescente extends Lampada{
    private int centimetros;

    public LampadaFluorescente(boolean estadoLampada, int centimentros) {
        super(estadoLampada);
        setCentimetros(centimetros);
    }

    public int getCentimetros() {
        return centimetros;
    }

    public void setCentimetros(int centimetros) {
        this.centimetros = centimetros;
    }
    
    public void tamanhoLampada(){
        System.out.println("A lampada mede " + getCentimetros() + " cm.");
    }
}
