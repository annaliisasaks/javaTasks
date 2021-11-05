package Week8.yl12;

import java.util.*;

public class ShoppingBasket {               // 12.5
    private List<Purchase> purchases;

    public ShoppingBasket() {

        this.purchases = new ArrayList<Purchase>();
    }

    public int getAmount(String product) {    // created for 12.7, may not need
        for (Purchase thisObject : this.purchases) {
            if (thisObject.get().equals(product)) {         // does "this.purchases" contain "thisObject.get()" ?
                return thisObject.getAmount();              // return "thisObject.getAmount()" if we find the object
            }
        }
        return 0;               // return 0 if it does not exist.
    }

    public Purchase get(String product) {     // created for 12.7, may not need
        for (Purchase thisObject : this.purchases) {
            if (thisObject.get().equals(product)) {         // does "this.purchases" contain "thisObject.get()" ?
                return thisObject;                    // return "thisObject.getAmount()" if we find the object
            }
        }
        return null;               // return null if it does not exist.
    }

    public void add(String product, int price) {            // 12.5 and 12.7  FIX ME for 12.7!!!
        boolean exists = false;         // define a boolean object outside of the following for loop

        for (Purchase thisObject : this.purchases) {
            if (thisObject.get().equals(product)) {         // compare the string "product" in "thisObject" to the "product" variable in "add()" parameter
                // if the object already exists...
                exists = true;                          // boolean object gets true if an object with same parameters as "add()" parameters already exists in "this.purchases"
                int index = this.purchases.indexOf(thisObject);     // find index of "thisObject"
                thisObject.increaseAmount();                        // increase the amount of "thisObject" by one.
                this.purchases.set(index, thisObject);              // replace the previous location of "thisObject" with the increased quantity "thisObject"
            }
        }

        if (exists==false) {
            Purchase newPurchase = new Purchase(product, 1, price);     // create new Purchase item with "add()" parameters
            this.purchases.add(newPurchase);                                    // add "newPurchase" object to "this.purchases"
        }
    }

    public int price() {                    // 12.5
        int purchasePrice = 0;

        for (Purchase thisObject : this.purchases) {
            purchasePrice = purchasePrice + thisObject.price();
        }

        return purchasePrice;
    }

    public void print() {                   // 12.6
        for (Purchase thisItem : this.purchases) {
            System.out.println(thisItem);
        }
    }

}
