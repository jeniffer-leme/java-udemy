package aulas.polimorfismo.abstract_;

public class Horista extends Empregado{
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, double valorHora) {
        super(nome, cpf);
        setValorHora(valorHora);
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        if(horasTrabalhadas >= 0) {
            this.horasTrabalhadas = horasTrabalhadas;
        } else {
            throw new IllegalArgumentException("horas trabalhadas deve ser maior ou igual a zero");
        }       
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora > 0){
            this.valorHora = valorHora;
        } else {
            throw new IllegalArgumentException("valor da hora deve ser maior ou igual a zero");
        }
    }
    
    @Override
    public double proventoSemanal(){
        if(getHorasTrabalhadas() > 40) {
            
            double horasExtras = getHorasTrabalhadas() - 40;
            return (40 * getValorHora()) + (horasExtras * (getValorHora() * 1.50));
            
        } else {
            return getHorasTrabalhadas() * getValorHora();
        } 
    }
    
    
}
