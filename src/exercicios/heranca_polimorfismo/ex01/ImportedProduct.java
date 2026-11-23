package exercicios.heranca_polimorfismo.ex01;

public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct(double customsFee, String name, double price) {
        super(name, price);
        setCustomsFee(customsFee);
    }

    

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }
    
    
    public double totalPrice() {
        return getPrice() + getCustomsFee();
    }
    
    @Override
    public String priceTag() {
        return super.priceTag() + "\n" + "Customs Fee: " + getCustomsFee() + "\n" + "Total Price: " + totalPrice();
    }
}
