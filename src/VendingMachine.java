import java.util.ArrayList;

public class VendingMachine<T> {
    private String name = "default";
    private ArrayList<Product> goods;

    public VendingMachine(String nameOfVendingMachine){
        this.name = nameOfVendingMachine;
        this.goods = new ArrayList<Product>();
    }

    public void addProduct(Product newProduct){
        goods.add(newProduct);
    }

    public Product getProductByName(String name) {
        for (Product el: goods) {
            if (el.getName().equals(name)) {
                return el;
            }

        }
        return null;
    }
}
