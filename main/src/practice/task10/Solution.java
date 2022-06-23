package practice.task10;

// Need write a function to split a string and convert it into
// an array of words;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static String[] stringToArray(String s) {
        ArrayList<String> list = new ArrayList<String>(List.of(s.split(" ")));
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
