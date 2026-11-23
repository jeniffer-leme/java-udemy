package exercicios.heranca_polimorfismo.ex02;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        setNumberOfEmployees(numberOfEmployees);
    }

    
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    
    @Override
    public Double tax() {
        double basicTax = (getNumberOfEmployees() > 10)
                ? getAnualIncome() * 0.14
                : getAnualIncome() * 0.16;

        return basicTax;
    }
    
}
