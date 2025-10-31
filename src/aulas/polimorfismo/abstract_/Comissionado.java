package aulas.polimorfismo.abstract_;

public class Comissionado extends Empregado{
    private double vendasRealizadas;
    private double taxaComissao;

    public Comissionado(String nome, String cpf) {
        super(nome, cpf);
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
        return getVendasRealizadas() * (getTaxaComissao() / 100.0);
    }
    
    
}
