package exercises.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if(integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void findWords(ArrayList<String> arr) {

        Scanner input = new Scanner(System.in);
        System.out.println("What length of word do you want to find?");
        int wordLength = input.nextInt();

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length() == wordLength) {
                System.out.println(arr.get(i));
            }
        }

    }

    public static void main(String[] arg) {

        ArrayList<Integer> randomNums = new ArrayList<>();

        randomNums.add(2);
        randomNums.add(5);
        randomNums.add(9);
        randomNums.add(22);
        randomNums.add(1);
        randomNums.add(23);
        randomNums.add(18);
        randomNums.add(0);
        randomNums.add(32);
        randomNums.add(19);

        System.out.println(randomNums);
        System.out.println(sumEven(randomNums));

        ArrayList<String> randomWords = new ArrayList<>();
        randomWords.add("Pickle");
        randomWords.add("apple");
        randomWords.add("red");
        findWords(randomWords);

    }

}
