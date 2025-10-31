package aulas.polimorfismo.abstract_;

public class AssalariadoComissionado extends Assalariado{
    private double vendasRealizadas;
    private double taxaComissao;

    public AssalariadoComissionado(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        setSalario(salario);
    }

    public double getVendasRealizadas() {
        return vendasRealizadas;
    }

    public void setVendasRealizadas(double vendasRealizadas) {
        if(vendasRealizadas >= 0){
            this.vendasRealizadas = vendasRealizadas;
        } else {
            throw new IllegalArgumentException("vendas realizadas deve ser maior ou igual a zero");
        }
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        if(taxaComissao >= 0 && taxaComissao <= 100){
            this.taxaComissao = taxaComissao;
        } else {
            throw new IllegalArgumentException("taxa de comissão deve ser maior ou igual a zero");
        }
    }

    @Override
    public double proventoSemanal(){
        return (getVendasRealizadas() * (getTaxaComissao() / 100.0)) + super.proventoSemanal();
    }
    
    
    
}
