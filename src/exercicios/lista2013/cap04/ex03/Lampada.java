package exercicios.lista2013.cap04.ex03;

public class Lampada {
    private boolean lampada;
    private int watts;

    public Lampada(int watts) {
        setWatts(watts);
    }
    
    public Lampada(){
        setWatts(60);
    }

    public boolean isLampada() {
        return lampada;
    }

    public void setLampada(boolean lampada) {
        this.lampada = lampada;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }
    
    
    
    public boolean acender(){
        if(isLampada()){
            return true;
        } else {
            return false;
        }
    }
}
