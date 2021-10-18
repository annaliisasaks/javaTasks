package Week4;

import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList<Integer> numbersInput;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.numbersInput = new ArrayList<Integer>();
    }

    public void addNumber(int number) {
        this.numbersInput.add(number);
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        int sum = 0;

        if (this.amountOfNumbers()==0) {
            return 0;
        } else {
            for (int number : this.numbersInput) {
                sum+=number;
            }

            return sum;
        }
    }

    public double average() {
        double theAverage = 0;

        if (this.amountOfNumbers()==0) {
            return 0;
        } else {
            theAverage = (this.sum()*1.0) / (this.amountOfNumbers()*1.0);
            return theAverage;
        }
    }
}
