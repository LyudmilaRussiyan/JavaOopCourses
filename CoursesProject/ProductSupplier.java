import java.util.ArrayList;

public class ProductSupplier {
    private String name;
    ArrayList<Supply>supplies=new ArrayList<>();

    public ProductSupplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
