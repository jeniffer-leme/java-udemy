package aulas.associacao.composicao;

public class Roda {
    
    //true se a roda estiver ok (sem problemas), false do contrário
    private boolean status;

    
    public Roda(boolean status) {
        setStatus(status);
    }
    
    
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
