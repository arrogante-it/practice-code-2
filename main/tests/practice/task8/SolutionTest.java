package practice.task8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void tests() {
        assertEquals(true, Solution.betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, Solution.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, Solution.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, Solution.betterThanAverage(new int[] {100, 90}, 11));
    }
}