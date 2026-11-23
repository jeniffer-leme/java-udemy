package exercicios.heranca_polimorfismo.ex02;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome); 
        setHealthExpenditures(healthExpenditures);
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        double basicTax = (getAnualIncome() < 20000.0)
                ? getAnualIncome() * 0.15
                : getAnualIncome() * 0.25;

        basicTax -= healthExpenditures * 0.5;
        return basicTax;
    }
}