package practice.task17_moloko;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void milk(){
        // count amount of symbol "o" that repit in word "moloko"
        String moloko = "moloko";

        List<String> list = new ArrayList<String>(List.of(moloko.split("")));

        int amount = 0;

        for(String el : list){
            if("o".equals(el)){
                amount++;
            }
        }
        System.out.println(amount);
    }

    public static void main(String[] args) {
        milk();
    }
}
