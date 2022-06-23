package practice.task3;

// Need create a function that gives a personalized greeting.
// This function takes two parameters: name and owner.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
    Map<Integer, String> map = new HashMap<>();


}


