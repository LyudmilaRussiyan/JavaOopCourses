import java.util.ArrayList;

public class Supply implements Order{
    private String nameOfProductSupplier;
    ArrayList<Product> productsToPurchase = new ArrayList<>();

    public Supply(String nameOfProductSupplier, String nameOfProduct, int number, double price ) {
        this.nameOfProductSupplier = nameOfProductSupplier;
    }

    public Supply(String nameOfProductSupplier, Product... purchaseRequest) {
        this.nameOfProductSupplier = nameOfProductSupplier;
     }

    //    public void changeBalanceOFProductAtStorage(){
//        if (storage.product.getName().contains(nameOfProduct)){
//        product.setCount(product.getCount()+number;
//        }
//    }

    public void changePurchasePrice(){

    }

    @Override
    public ArrayList<Product> requestToPurchase() {
        System.out.println("requestToPurchase: " + this.productsToPurchase.toString());
        return productsToPurchase;
    }

    @Override
    public ArrayList<Product> requestToSell() {
        System.out.println("Not implemented");
        return null;
    }
}
