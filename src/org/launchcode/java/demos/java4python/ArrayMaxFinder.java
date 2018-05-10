package org.launchcode.java.demos.java4python;

public class ArrayMaxFinder {
    public static void main(String[] args){
        int[] x = {4, 8, 12, 13, 5, 2};
        int myMax = findMax(x);
        System.out.println(myMax);
    }

    public static int findMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i ++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
