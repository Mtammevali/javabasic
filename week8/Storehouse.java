package week8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.products = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        if (products.get(product) == null) {
            return -99;
        }
        return products.get(product);
    }
    public int stock(String product){
        if(this.stocks.containsKey(product)){
            return this.stocks.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product){
        if(this.stocks.containsKey(product)){
            if(this.stocks.get(product) > 0){
                this.stocks.put(product, this.stocks.get(product) - 1);
                return true;
            }
            return false;
        }
        return false;
    }
    public Set<String> products() {
        return this.products.keySet();
    }
}
