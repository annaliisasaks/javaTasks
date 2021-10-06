package Week3;
import java.util.ArrayList;
import java.util.Collections;
public class ül66 {
    public static int greatest(ArrayList<Integer> list) {
        //gets highest number in the list
        int highestNumber = Collections.max(list);
        return highestNumber;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}
