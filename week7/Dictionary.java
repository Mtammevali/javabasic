package week7;

import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();

    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }
    public  int amountOfWords(){
        return this.dictionary.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String key : dictionary.keySet()) {
            list.add(key + " = " + dictionary.get(key));
        }
        return list;

    }
}

