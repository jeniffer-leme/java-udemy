package exercicios.lista2013.cap02.ex28;

public class Lampada {
    private boolean estadoLampada;
    private int watts;
    private int contadorAcesa;

    public Lampada(boolean estadoLampada, int watts) {
        this.estadoLampada = estadoLampada;
        this.watts = watts;
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
        contadorAcesa++;
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
    
    public int incrementarContador(){
        return contadorAcesa;
    }
    
    
}
