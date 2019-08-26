package LesBases.heritage;

public class Electro extends Article {

    private int warranty;

    public Electro(String name, double buyPrice, double sellPrice, int warranty) {
        super(name, buyPrice, sellPrice);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
