package exercicios.lista2013.cap02.ex09;

public class Lampada2 {
    private boolean estadoLampada;
    private int watts;

    public Lampada2(boolean estadoLampada, int watts) {
        setEstadoLampada(estadoLampada);
        setWatts(watts);
    }

    public boolean getEstadoLampada() {
        return estadoLampada;
    }

    public void setEstadoLampada(boolean estadoLampada) {
        this.estadoLampada = estadoLampada;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }
    
    
    public void acende(){
        setEstadoLampada(true);
    }
    
    public void apaga(){
        setEstadoLampada(false);
    }
    
    public boolean mostrarEstado(){
        if(getEstadoLampada()){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ehEconomica(){
        if(watts < 40){
            return true;
        } else {
            return false;
        }
    }
    
    
}
