package Week4.BoundedCounter;


public class BoundedCounter {
    private int value=0;
    private int upperLimit;


    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value<this.upperLimit) {
            this.value++;
        } else if (this.value==upperLimit){
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value>=10) {
            return "" + this.value;
        } else { // if (this.value<10) {
            return "0" + this.value;
        }
    }

    public int getValue() {			// might need to change this? No, this seems good.
        return this.value;
    }

    public void setValue(int value) {
        if (value<0 || value>this.upperLimit) {
            // "Do nothing if less than 0 or greater than upperLimit"
        } else {
            this.value = value;
        }

    }
}