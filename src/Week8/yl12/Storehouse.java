package Week8.yl12;

import java.util.*;

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Storehouse() {
        this.prices = new HashMap<String, Integer>();           // 12.1
        this.stock = new HashMap<String, Integer>();            // 12.2
    }

    public void addProduct(String product, int price, int stock) {      // 12.1 and 12.2
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {              // 12.1
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {              // 12.2
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {           // 12.2
        if (this.stock.containsKey(product)) {      // if the key exists in "stock" hashmap

            if (this.stock.get(product)>0) {        // if the value of "stock" key "product" is greater than 0 ((stock cannot go below 0))
                this.stock.put(product, this.stock.get(product) - 1);       // subtract 1 from the value of "this.stock.get(product)", "product" is the key
                return true;                       // return false if stock would have gone below 0 ((not available in storehouse))
            }
        }
        return false;                               // else return false (but don't actually use an else statement, as this will send an error to compiler because return may not ever execute
    }

    public Set<String> products() {                 // 12.3
        return this.prices.keySet();                // return the keySet() of hashmap "prices"
    }

}
