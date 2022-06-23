package practice.task7;

// need create a function that it finds the average of the three
// scores passed to it and returns the letter value associated with that grade.

public class Solution {
    public static char getGrade(int s1, int s2, int s3){
        int score = (s1 + s2 + s3) / 3;
        if(90 <= score && score <= 100){
            return 'A';
        }else if (80 <= score && score < 90) {
            return 'B';
        }else if (70 <= score && score < 80) {
            return 'C';
        }else if (60 <= score && score < 70) {
            return 'D';
        }else if(0 <= score && score < 60){
            return 'F';
        }
        return '0';
    }
}
