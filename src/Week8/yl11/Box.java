package Week8.yl11;

import java.util.*;


public class Box implements ToBeStored {
    private double maxWeight;
    private int currentNumberItems;
    private ArrayList<ToBeStored> itemsInside;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentNumberItems = 0;
        this.itemsInside = new ArrayList<ToBeStored>();
    }

    public double weight() {
        double weight = 0;

        for (ToBeStored item : this.itemsInside) {
            weight = weight + item.weight();
        }

        return weight;
    }

    public void add(ToBeStored item) {
        if (this.weight()+item.weight()>this.maxWeight) {
            // do nothing if weight would exceed this.maxWeight
        } else {
            this.itemsInside.add(item);
            this.currentNumberItems++;
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.currentNumberItems + " things, total weight " + this.weight() + " kg";
    }
}
