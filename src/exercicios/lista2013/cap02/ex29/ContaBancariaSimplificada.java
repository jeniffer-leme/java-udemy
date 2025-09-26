package exercicios.lista2013.cap02.ex29;

public class ContaBancariaSimplificada {
    private String nome;
    private double saldo;
    private boolean ehEspecial;

    public ContaBancariaSimplificada(String nome, double saldo, boolean ehEspecial) {
        this.nome = nome;
        this.saldo = saldo;
        this.ehEspecial = ehEspecial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getEhEspecial() {
        return ehEspecial;
    }

    public void setEhEspecial(boolean ehEspecial) {
        this.ehEspecial = ehEspecial;
    }
    
    
    public void abreConta(){
        setSaldo(0);
        setEhEspecial(false);
    }
    
    public void depositarValor(double valor){
        setSaldo(getSaldo() + valor);
    }
    
    public void retirarValor(double valor){
        if(!getEhEspecial()){
            if(valor <= getSaldo()){
                setSaldo(getSaldo() - valor);
            } else {
                throw new IllegalArgumentException("Saldo insuficiente.");
            }
        } else {
            setSaldo(getSaldo() - valor);
        }
    }
    
}
