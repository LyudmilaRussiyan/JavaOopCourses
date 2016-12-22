public class Product {
    private String name;
    private int count;
    private double purchasePrice;

    public Product(String name, int count, double purchasePrice) {
        this.name = name;
        this.count = count;
        this.purchasePrice = purchasePrice;
    }

    public Product(){}

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", count=" + count + ", purchasePrice=" + purchasePrice + '}';
    }
}
