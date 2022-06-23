package practice.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Solution.rockPaperScissors("rock", "scissors"));
        assertEquals("Player 1 won!", Solution.rockPaperScissors("scissors", "paper"));
        assertEquals("Player 1 won!", Solution.rockPaperScissors("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Solution.rockPaperScissors("scissors", "rock"));
        assertEquals("Player 2 won!", Solution.rockPaperScissors("paper", "scissors"));
        assertEquals("Player 2 won!", Solution.rockPaperScissors("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Solution.rockPaperScissors("scissors", "scissors"));
        assertEquals("Draw!", Solution.rockPaperScissors("paper", "paper"));
        assertEquals("Draw!", Solution.rockPaperScissors("rock", "rock"));
    }
}