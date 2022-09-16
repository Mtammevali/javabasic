package week8;

import java.util.HashMap;
import java.util.Map;

public class Storehouse {
    private Map<String, Integer> products;


    public Storehouse() {
        this.products = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
    }

    public int price(String product) {
        if (products.get(product) == null) {
            return -99;
        }
        return products.get(product);
    }

}
