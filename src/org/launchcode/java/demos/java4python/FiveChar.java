package org.launchcode.java.demos.java4python;

import java.util.ArrayList;

public class FiveChar {
    public static void main(String[] args) {

        String text = "The quick brown fox jumps over the lazy dog you moron";
        System.out.println("What I input:");
        System.out.println(text);
        System.out.println("What I output by counting five char words:");
        ArrayList<String> result = FiveCounter(text);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }

    public static ArrayList<String> FiveCounter(String input){
        ArrayList<String> phrase = new ArrayList<>();
        String[] textArray = input.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].length() == 5) {
                phrase.add(textArray[i]);
            }
        }
        return phrase;
    }
}
