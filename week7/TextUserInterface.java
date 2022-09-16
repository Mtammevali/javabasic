package week7;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    public void start() {

        System.out.println("Statement:");
        System.out.println("  add - adds a word pair to the dictionary\n"
                + "  translate - asks a word and prints its translation\n"
                + "  quit - quit the text user interface");


    }

}
