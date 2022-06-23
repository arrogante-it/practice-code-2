package practice.task20;

//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.

public class Solution {
    public static Integer basicMath(String op, int v1, int v2) {
        return op.equals("+") ? v1 + v2 :
                op.equals("-") ? v1 - v2 :
                        op.equals("*") ? v1 * v2 : v1 / v2;
    }
}
