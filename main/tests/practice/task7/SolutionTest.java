package practice.task7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        assertEquals('A', Solution.getGrade(95,90,93));
        assertEquals('A', Solution.getGrade(100,85,96));
        assertEquals('A', Solution.getGrade(92,93,94));
        assertEquals('A', Solution.getGrade(100,100,100));
    }
    @Test
    public void test2() {
        assertEquals('B', Solution.getGrade(70,70,100));
        assertEquals('B', Solution.getGrade(82,85,87));
        assertEquals('B', Solution.getGrade(84,79,85));
    }
    @Test
    public void test3() {
        assertEquals('C', Solution.getGrade(70,70,70));
        assertEquals('C', Solution.getGrade(75,70,79));
        assertEquals('C', Solution.getGrade(60,82,76));
    }
    @Test
    public void test4() {
        assertEquals('D', Solution.getGrade(65,70,59));
        assertEquals('D', Solution.getGrade(66,62,68));
        assertEquals('D', Solution.getGrade(58,62,70));
    }
    @Test
    public void test5() {
        assertEquals('F', Solution.getGrade(44,55,52));
        assertEquals('F', Solution.getGrade(48,55,52));
        assertEquals('F', Solution.getGrade(58,59,60));
        assertEquals('F', Solution.getGrade(0,0,0));
    }
}