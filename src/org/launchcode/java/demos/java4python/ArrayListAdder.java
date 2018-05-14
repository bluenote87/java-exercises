package org.launchcode.java.demos.java4python;

import java.util.ArrayList;

public class ArrayListAdder {
    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        int[] someNums = {3, 4, 5, 1};
        for (int i = 0; i < someNums.length; i++) {
            firstList.add(someNums[i]);
        }
        ArrayList<Integer> secondList = new ArrayList<>();
        int[] moreNums = {1, 6};
        for (int i = 0; i < moreNums.length; i++) {
            secondList.add(moreNums[i]);
        }
        ArrayList<Integer> resultList = new ArrayList<>();

        int len; //this line is needed for scope, or for loop won't recognize it
        if (firstList.size() > secondList.size()) {
            len = firstList.size(); //this is inner scope, can't initialize here
        } else {
            len = secondList.size(); //ditto
        }

        for (int i = 0; i < len; i++) {
            if (i < secondList.size() && i < firstList.size()) {
                resultList.add(firstList.get(i) + secondList.get(i));
            } else if (i < firstList.size( )) {
                resultList.add(firstList.get(i));
            } else if (i < secondList.size()) { //condition is redundant but illustrates the logic
                resultList.add(secondList.get(i));
            }
        }
        System.out.println(resultList);
    }

}
