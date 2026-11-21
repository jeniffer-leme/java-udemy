package aulas.polimorfismo.interface_;

// a classe Boleto tem uma relação de "é um" com a interface Pagavel
public class Boleto implements Pagavel {
    private String cedente;
    private double valor;
    private double juros;
    private boolean vencido;

    public Boleto(String cedente, double valor, double juros, boolean vencido) {
        setCedente(cedente);
        setValor(valor);
        setJuros(juros);
        setValor(valor);
    }

    public String getCedente() {
        return cedente;
    }

    public void setCedente(String cedente) {
        if(cedente != null){
            this.cedente = cedente;
        } else {
            throw new IllegalArgumentException("Cedente não pode ser nulo");
        }
    }

    public double getValor() {
        if(isVencido() == false) {
            return valor;
        } else {
            return valor + (valor * getJuros() / 100.0);
        }
    }

    public void setValor(double valor) {
        if(valor >= 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor não pode ser negativo.");
        }
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        if(juros >= 0 && juros <= 100) {
            this.juros = juros;
        } else {
            throw new IllegalArgumentException("Juros não pode ser menor que 0 e maior que 100.");
        }
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }
    
    @Override
    public String getDescricao() {
        return getCedente();
    }
    
    @Override
    public double getValorAPagar() {
        return getValor();
    }
    
}
