package practice.task14_outputAmountOfSymbolsFromListUsingMap;

import java.util.*;

public class Solution {
    public static void outputMap(){
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "B", "C", "C", "B"));

        Map<String, Integer> map = new HashMap<>();

        for(String element : list){
            int amountOfSymbols = map.getOrDefault(element, 0) + 1;
            map.put(element, amountOfSymbols);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()){
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static void main(String[] args) {
        outputMap();
        // A - 1
        // B - 3
        // C - 2
    }
}
