package practice.task5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getAbbreviationOfName() {
        assertEquals("S.H", Solution.getAbbreviationOfName("Sam Harris"));
        assertEquals("P.F", Solution.getAbbreviationOfName("Patrick Feenan"));
        assertEquals("E.C", Solution.getAbbreviationOfName("Evan Cole"));
        assertEquals("P.F", Solution.getAbbreviationOfName("P Favuzzi"));
        assertEquals("D.M", Solution.getAbbreviationOfName("David Mendieta"));
    }
}