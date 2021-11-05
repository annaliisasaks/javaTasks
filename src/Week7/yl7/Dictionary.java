package Week7.yl7;

import java.util.*;

public class Dictionary {
    private HashMap<String, String> translator;

    public Dictionary() {
        this.translator = new HashMap<String, String>();
    }

    public String translate(String word) {

        String key = this.translator.get(word);

        return key;
    }

    public void add(String word, String translation) {
        this.translator.put(word, translation);
    }

    public int amountOfWords() {
        int numberOfWords = 0;

        for (String key : this.translator.keySet()) {
            numberOfWords++;
        }

        return numberOfWords;
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();

        for (String key : this.translator.keySet()) {		// iterate through all keys
            String valueString = this.translator.get(key);	// get value using current key

            String keyValue = key + " = " + valueString;	// turn key and value into one string

            translationList.add(keyValue);
        }

        return translationList;
    }
}