package practice.task12;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void FixedTests() {
        assertEquals(true, Solution.isIsogram("Dermatoglyphics"));
        assertEquals(true, Solution.isIsogram("isogram"));
        assertEquals(false, Solution.isIsogram("moose"));
        assertEquals(false, Solution.isIsogram("isIsogram"));
        assertEquals(false, Solution.isIsogram("aba"));
        assertEquals(false, Solution.isIsogram("moOse"));
        assertEquals(true, Solution.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Solution.isIsogram(""));
    }
}