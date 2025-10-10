package exercicios.lista2013.cap04.ex02;

public class Lampada {
    private boolean lampada;

    public Lampada(boolean lampada) {
        setLampada(lampada);
    }

    public boolean isLampada() {
        return lampada;
    }

    public void setLampada(boolean lampada) {
        this.lampada = lampada;
    }
    
    public boolean mostrarEstado(){
        if(isLampada()){
            return true;
        } else {
            return false;
        }
    }
    
}
