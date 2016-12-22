import java.util.ArrayList;

public class SupplyRunner {
    public static void main(String[] args) {

        Product tel = new Product("Tel", 1, 100);
        Storage storage = new Storage (new Product("TVset", 5, 1000.0), new Product("Fridge", 10, 5000), new Product ("Gas oven", 14, 3000.0));

        storage.printAvailableStorageProducts();

        storage.addProduct(tel);
        storage.printAvailableStorageProducts();

        storage.removeProduct(tel);
        storage.printAvailableStorageProducts();

        ProductSupplier productSupplier=new ProductSupplier("LG");

//        Supply supply1=new Supply("LG");
//        productSupplier.makeSupply

        Product purTel1 = new Product("PurTel1", 1, 10);
        Product purTel2 = new Product("PurTel2", 2, 20);
        Product purTel3 = new Product("PurTel3", 3, 30);

        ArrayList<Product> purchaseRequest = new ArrayList<>();

        purchaseRequest.add(purTel1);
        purchaseRequest.add(purTel2);
        purchaseRequest.add(purTel3);

        Supply sup = new Supply("LG", purTel1, purTel2, purTel3);

        sup.requestToPurchase();

        sup.toString();

    }
}
