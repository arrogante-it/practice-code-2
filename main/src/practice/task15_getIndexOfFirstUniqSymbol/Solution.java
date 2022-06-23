package practice.task15_getIndexOfFirstUniqSymbol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void getIndexOfFirstUniqSymbol(){
        String s = "atatcatdt";

        List<String> list = new ArrayList<String>(List.of(s.split("")));

        Map<String, Integer> map = new HashMap<>();

        for(String element : list){
            int amountOfElemtns = map.getOrDefault(element, 0) + 1;
            map.put(element, amountOfElemtns);
        }


        String symbol = "";
        for(Map.Entry<String, Integer> pair : map.entrySet()){
            if(pair.getValue() == 1){
                symbol = pair.getKey();
                break;
            }
        }

        Integer index = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(symbol)){
                index = i;
            }
        }

        System.out.println(index);

    }

    public static void main(String[] args) {
        getIndexOfFirstUniqSymbol();
    }
}
