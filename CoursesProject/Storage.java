import java.util.ArrayList;

public class Storage {

    ArrayList<Product> products = new ArrayList<>();

    public Storage(Product... product) {
        for (Product p : product) {
            this.products.add(p);
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printAvailableStorageProducts(){
        for(int item = 0; item < products.size();) {
            System.out.println(item+1 + " " + products.get(item).toString());
        item++;
        }
        System.out.println("\n");
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
