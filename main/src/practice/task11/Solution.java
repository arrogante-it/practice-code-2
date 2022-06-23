package practice.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int sortDesc(final int num) {

        String number = String.valueOf(num);

        ArrayList<String> list = new ArrayList<String>(List.of(number.split("")));
        ArrayList<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listInteger.add(Integer.parseInt(list.get(i)));
        }

        Collections.sort(listInteger);
        Collections.reverse(listInteger);

        ArrayList<String> listStrings = new ArrayList<>();
        for (int i = 0; i < listInteger.size(); i++) {
            listStrings.add(String.valueOf(listInteger.get(i)));
        }

        String sorted = "";
        for (int i = 0; i < listStrings.size(); i++) {
           sorted = sorted.concat(listStrings.get(i));
        }

        return Integer.parseInt(sorted);
    }
}
