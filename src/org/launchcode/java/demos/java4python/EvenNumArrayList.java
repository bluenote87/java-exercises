package org.launchcode.java.demos.java4python;

import java.util.ArrayList;

public class EvenNumArrayList {


    public static void main(String[] args) {
        int result;
        ArrayList<Integer> anArray = new ArrayList<>();
        int[] primitive = {1, 8, 4, 10, 11, 5, 7, 18, 21, 71};
        for (int i = 0; i < primitive.length; i++) {
            anArray.add(primitive[i]);
        }
        EvenNumArrayList program = new EvenNumArrayList();
        result = program.SumOfTheEven(anArray);
        System.out.println("The sum of the even numbers within this array is: " + result);


    }
    private int SumOfTheEven(ArrayList<Integer> myList) {
        int sum = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                sum = sum + myList.get(i);
            }
        }
        return sum;

    }
}
