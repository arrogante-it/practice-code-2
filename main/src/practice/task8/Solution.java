package practice.task8;

// Calculate the average and compare your score.
// Return True if you're better, else False!

public class Solution {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int[] local = new int[classPoints.length + 1];
        for (int i = 0; i < classPoints.length; i++) {
            local[i] = classPoints[i];
        }
        local[local.length - 1] = yourPoints;
        int sumOfScores = 0;
        for (int i = 0; i < local.length; i++) {
            sumOfScores = sumOfScores + local[i];
        }
        int average = sumOfScores / local.length;
        if (average < yourPoints) {
            return true;
        } else {
            return false;
        }
    }
}
