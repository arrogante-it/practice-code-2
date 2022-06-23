package practice.task19;

// Given a random non-negative number,
// you have to return the digits of this number within an array in reverse order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int[] digitize(long n) {
        List<String> list = new ArrayList<String>(List.of(String.valueOf(n).split("")));
        Collections.reverse(list);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = Integer.parseInt(list.get(i));
        }
       return array;
    }
}
