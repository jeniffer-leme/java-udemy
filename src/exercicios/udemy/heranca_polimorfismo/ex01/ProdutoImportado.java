package exercicios.udemy.heranca_polimorfismo.ex01;

public class ProdutoImportado extends Produto {
    private double precoAlfandega;

    public ProdutoImportado() {
    }
    
    

    public double getCustomsPrice() {
        return precoAlfandega;
    }

    public void setCustomsPrice(double precoAlfandega) {
        this.precoAlfandega = precoAlfandega;
    }
    
    @Override
    public String priceTag() {
        return super.getNome() + " $ " + String.format("%.2f", super.getPreco());
    }
    
    public double totalPreco(double taxa) {
        
    }
}
