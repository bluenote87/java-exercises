package org.launchcode.java.demos.java4python;

import java.util.HashMap;

public class CountingChar {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> counts = new HashMap<>();
        char[] charactersInString = text.toCharArray();

        for(char c : charactersInString) { //for c in charactersInString
            int x = 1;
            if(counts.containsKey(c)) {
                x = counts.get(c) + 1;
            }
            counts.put(c, x);
        }

        for(char k : counts.keySet()) {
            System.out.println(k + ": " + counts.get(k));
        }
    }
}
