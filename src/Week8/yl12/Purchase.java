package Week8.yl12;

public class Purchase {                 // 12.4
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public String get() {           // created for 12.7, may not need
        return this.product;
    }

    public int getAmount() {           // created for 12.7, may not need
        return this.amount;
    }

    public int price() {                // 12.4
        int thisPurchase = this.unitPrice * this.amount;
        return thisPurchase;
    }

    public void increaseAmount() {      // 12.4
        this.amount++;
    }

    @Override
    public String toString() {          // 12.4
        return this.product + ": " + this.amount;
    }

}
