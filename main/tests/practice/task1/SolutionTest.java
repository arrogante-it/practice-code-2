package practice.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numberToString() {
        assertEquals("67", Solution.numberToString(67));
        assertEquals("123", Solution.numberToString(123));
        assertEquals("999", Solution.numberToString(999));
    }
}