package practice.task16_reverseArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void reverseOfArray(){
        int[] array = new int[]{1,2,3,4,5};
        Arrays.stream(array).forEach(System.out::print);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        System.out.println();
        Arrays.stream(array).forEach(System.out::print);
    }

    public static void main(String[] args) {
        reverseOfArray();
    }
}
