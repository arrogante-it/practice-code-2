package practice.task13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals(811181, new Solution().squareDigits(9119));
        assertEquals(0, new Solution().squareDigits(0));
    }
}