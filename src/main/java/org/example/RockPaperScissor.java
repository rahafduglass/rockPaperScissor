package org.example;

import java.util.Random;
import java.util.Stack;

public class RockPaperScissor {
    private final String[] rockPaperScissor = {"rock", "paper", "scissor"};
    private final StringBuilder computerMove = new StringBuilder(rockPaperScissor[new Random().nextInt(rockPaperScissor.length)]);
    private  StringBuilder userMove = new StringBuilder();

    public StringBuilder getUserMove() {
        return userMove;
    }

    public  void setUserMove(StringBuilder userMove) {
        this.userMove = userMove;
    }

    private final StringBuilder result = new StringBuilder();

    public void printMoves() {
        System.out.println("computer played: " + this.computerMove);
        System.out.println("user played: " + this.userMove);
    }

    public StringBuilder whoWins() {

        String userMove= this.userMove.toString();
        String computerMove= this.computerMove.toString();
        if (computerMove.contentEquals(userMove)) {
                result.append("It's a TIE");
            } else if (computerMove.equals("rock")) {
                if (userMove.equals("paper"))
                    result.append("You won!!, computer lost ");
                else if (userMove.equals("scissor"))
                    result.append("computer wins!! You lost!! :( ");
            } else if (computerMove.equals("paper")) {
                if (userMove.equals("scissor"))
                    result.append("You won!!, computer lost ");
                else if (userMove.equals("rock"))
                    result.append("computer wins!! You lost!! :( ");
            } else if (computerMove.equals("scissor")) {
                if (userMove.equals("rock"))
                result.append("You won!!, computer lost ");
            else if (userMove.equals("paper"))
                result.append("computer wins!! You lost!! :( ");
        }
        return result;

    }

}
