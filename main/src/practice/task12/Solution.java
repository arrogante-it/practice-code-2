package practice.task12;

// An isogram is a word that has no repeating letters, consecutive or non-consecutive.
// Implement a function that determines whether a string that contains only letters is an isogram.
// Assume the empty string is an isogram. Ignore letter case.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static boolean  isIsogram(String str) {
        boolean isMoreThanOne = true;

        ArrayList<String> list1 = new ArrayList<>(List.of(str.split("")));
        ArrayList<String> list2 = new ArrayList<>();
        for(String element : list1){
            list2.add(element.toLowerCase());
        }
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list2.size(); i++) {
            int amount = map.getOrDefault(list2.get(i), 0) + 1;
            map.put(list2.get(i), amount);
        }

        for(Map.Entry<String, Integer> pair : map.entrySet()){
            if(pair.getValue() > 1){
                isMoreThanOne = false;
            }
        }

        return isMoreThanOne;
    }
}
