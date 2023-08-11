package main.java.org.launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String firstSentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or twice" +
                " she had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’\n" +
                "\n";
//        String separatedIntoWords = firstSentence.split(" ");

        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term within the first sentence of Alice's Adventures in Wonderland: ");
        String search = input.nextLine();
        Boolean searchResults = firstSentence.contains(search);
//

        /*Incorrect Attempts*/
//        boolean search = input.hasNext(firstSentence);
//              --> above attempt doesn't throw an error but always says false
//        boolean search = firstSentence.contains(input);
//        boolean search = firstSentence.contains(input);
//        boolean search = index.indexOf(firstSentence);

//        str.contains
        System.out.println(searchResults);

    }
}
