package practice.task19;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Solution.digitize(35231));
        assertArrayEquals(new int[] {0}, Solution.digitize(0));
    }
}