package practice.task18;

// Consider an array/list of sheep where some sheep may be missing from their place.
// Need a function that counts the number of sheep present in the array (true means present).

public class Solution {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] == Boolean.TRUE){
                counter ++;
            }
        }
        return counter;
    }
}
