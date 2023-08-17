package studio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hiddenFiguresQuote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> finalCounts = new HashMap<>();
        char[] charArray = hiddenFiguresQuote.toCharArray();

         for (int i=0; i<charArray.length; i++) {
              if (finalCounts.containsKey(charArray[i])){
                  finalCounts.put(charArray[i], finalCounts.get(charArray[i]) +1);
              }else {
                  finalCounts.put(charArray[i], 1);
              }

              for (Map.Entry entry: finalCounts.entrySet()){
                  System.out.println(entry.getKey() + ": " + entry.getValue());
              }

          }
        }

    }

