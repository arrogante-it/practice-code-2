package practice.task4;

// make two functions(max and min, or maximum and minimum)
// that receive a array of integers as inut and return, respectively,
// the largest and lowest number in that list.
// example: [4,6,2,1,9,63,-134,566] --> max = 566, min = -134

public class Solution {

    public int max(int[] array){

        int maximumNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximumNumber){
                maximumNumber = array[i];
            }
        }
        return maximumNumber;
    }

    public int min(int[] array){

        int minimumNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(minimumNumber > array[i]){
                minimumNumber = array[i];
            }
        }
        return minimumNumber;
    }
}
