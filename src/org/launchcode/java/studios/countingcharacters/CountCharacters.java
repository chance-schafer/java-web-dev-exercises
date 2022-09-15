package org.launchcode.java.studios.countingcharacters;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CountCharacters {

    public static void countCharacters(String str) {

        HashMap<String, Integer> charHashMap = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.toLowerCase().charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++){
                if(str.charAt(j)==ch) {
                    count++;
                }
            }
            if(! (str.charAt(i) == ' ') && ! (str.charAt(i) == ',') && ! (str.charAt(i) == '.') && ! (str.charAt(i) == '\'')) {
                charHashMap.put(str.toLowerCase().charAt(i) + "", count);
            }
        }

        for (Map.Entry m:charHashMap.entrySet()){
            System.out.println(m.getKey() + ": " + m.getValue());
        }

    }

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        System.out.println("What string do you want to count all the occurrences of each letter?");
        String quote = input.nextLine();

        countCharacters(quote);

    }

}

