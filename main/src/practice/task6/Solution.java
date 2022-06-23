package practice.task6;

// The square sum function so that it squares each number
// passed into it and then sums the result together.

public class Solution {
    public static int squareSum(int[] number){

        int squareNumber = 0;
        for (int i = 0; i < number.length; i++) {
            squareNumber = squareNumber + number[i] * number[i];
        }
        return squareNumber;
    }
}
