package practice.task2;

// need return which player won! In case of draw return "Draw!".
// examples: "scissors", "paper" --> "Player 1 won!"
//           "scissors", "rock" --> "PLayer 2 won!"
//           "paper", "paper" --> "Draw!"

public class Solution {
    public static String rockPaperScissors(String p1, String p2) {
        if ("rock".equals(p1) && "scissors".equals(p2)
                || "scissors".equals(p1) && "paper".equals(p2)
                || "paper".equals(p1) && "rock".equals(p2)) {
            return "Player 1 won!";
        } else if ("rock".equals(p2) && "scissors".equals(p1)
                || "scissors".equals(p2) && "paper".equals(p1)
                || "paper".equals(p2) && "rock".equals(p1)) {
            return "Player 2 won!";
        } else {
            return "Draw!";
        }
    }
}
