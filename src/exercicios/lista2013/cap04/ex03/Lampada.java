package exercicios.lista2013.cap04.ex03;

public class Lampada {
    private boolean acesa;
    private int watts;

    public Lampada(int watts) {
        setWatts(watts);
    }
    
    public Lampada(){
        setWatts(60);
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }
    
    public void mostrarEstado(){
        if(acesa){
            System.out.println("A lâmpada está acesa.");
        } else {
            System.out.println("A lâmpada está apagada.");
        }
    }
}
