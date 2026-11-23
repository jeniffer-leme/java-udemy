package exercicios.heranca_polimorfismo.ex01;

import java.util.Date;

public class UsedProduct extends Product {
    private Date manufactureDate;

    public UsedProduct(Date manufactureDate, String name, double price) {
        super(name, price);
        setManufactureDate(manufactureDate);
    }

    

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    
    @Override
    public String priceTag() {
        return super.priceTag() + "\n" + "Date: " + getManufactureDate();
    }
}
