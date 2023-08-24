package studio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        //Bonus: Prompt the user to enter the string in the command line.
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to count? ");
        //make case insensitive:

        String testString = input.nextLine().toLowerCase();

//        String testString = "If the product of two terms is zero then " +
//                "common sense says at least one of the two terms has to be zero " +
//                "to start with. So if you move all the terms over to one side, you " +
//                "can put the quadratics into a form that can be factored allowing that" +
//                " side of the equation to equal zero. Once you’ve done that, it’s pretty " +
//                "straightforward from there.";

        HashMap<Character, Integer> letters = new HashMap<>();
//        char[] charArray = testString.toCharArray();

        for (char letter : testString.toCharArray()) {
            //ensure input includes only letters
            if (Character.isLetter(letter)) {
                if (letters.containsKey(letter)) {
                    letters.put(letter, letters.get(letter) + 1);
                } else {
                    letters.put(letter, 1);
                }
            }
            for (Map.Entry<Character, Integer> item : letters.entrySet()) {
                System.out.println(item.getKey() + ": " + item.getValue());
            }
        }
    }
}

//Other method -- this gets correct results as well:
//         for (int i=0; i<charArray.length; i++) {
//              if (letters.containsKey(charArray[i])){
//                  letters.put(charArray[i], letters.get(charArray[i]) +1);
//              }else {
//                  letters.put(charArray[i], 1);
//              }
//
//              for (Map.Entry entry: letters.entrySet()){
//                  System.out.println(entry.getKey() + ": " + entry.getValue());
//              }
//
//          }
//        }
//
//    }

