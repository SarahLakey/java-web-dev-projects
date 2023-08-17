import java.util.Scanner;


public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
//        Loop through the array and print out each value
//        for (int i : integerArray) {
//            System.out.println(i);
//        }
//        modify the loop to only print the odd numbers

        for (int i : integerArray) {
            if (integerArray[i]%2!=0){
                System.out.println(integerArray[i]);
            }
        }

        String[] quote = new String[] {"“I would not, could not, in a box." +
                " I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.”"};
    }
}
