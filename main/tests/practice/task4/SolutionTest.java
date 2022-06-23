package practice.task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void max() {
        assertEquals(566, solution.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, solution.max(new int[]{5}));
    }

    @Test
    public void min() {
        assertEquals(-110, solution.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, solution.min(new int[]{42, 54, 65, 87, 0}));
    }
}