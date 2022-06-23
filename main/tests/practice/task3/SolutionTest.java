package practice.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void greet() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Solution.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Solution.greet("Greg", "Daniel"));
    }
}