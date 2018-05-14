package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingChar {

    public static void main(String[] args) {
        String ipsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = ipsum.toCharArray();

        HashMap<Character, Integer> countChar = new HashMap<>();
        for (int i = 0; i < charactersInString.length; i++) {
            if (countChar.containsKey(charactersInString[i])) {
                int prevValue = countChar.get(charactersInString[i]);
                countChar.replace(charactersInString[i], prevValue + 1);
            } else {
                countChar.put(charactersInString[i], 1);
            }
        }


        for (Map.Entry<Character, Integer> data : countChar.entrySet()) {
            char displayChar = data.getKey();
            int displayInt = data.getValue();
            System.out.println(displayChar + ": " + displayInt);
        }
    }
}
