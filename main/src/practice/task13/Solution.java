package practice.task13;

// To square every digit of a number and concatenate them.
// For example, if we run 9119 through the function, 811181 will come
// out, because 9^2 is 81 and 1^2 is 1.

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int squareDigits(int n) {
        String numberString = String.valueOf(n);
        List<String> list1 = new ArrayList<String>(List.of(numberString.split("")));
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list2.add(Integer.parseInt(list1.get(i)));
        }
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            listResult.add(list2.get(i) * list2.get(i));
        }
        String result = "";
        for (int i = 0; i < listResult.size(); i++) {
            result = result + listResult.get(i);
        }
        int resultInteger = Integer.parseInt(result);
        return resultInteger;
    }
}
