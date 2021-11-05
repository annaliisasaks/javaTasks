package Week8.yl15;

import java.util.*;

public class SortAgainstSuitAndValue implements Comparator<Card> {


    public int compare(Card card1, Card card2) {                // 15.5
        if (card1.getSuit() > card2.getSuit()) {
            return 1;
        } else if (card1.getSuit() < card2.getSuit()) {
            return -1;
        } else if (card1.getSuit() == card2.getSuit()) {
            if (card1.getValue() > card2.getValue()) {
                return 1;
            } else if (card1.getValue() < card2.getValue()) {
                return -1;
            }
        }
        return 0;
    }
}
