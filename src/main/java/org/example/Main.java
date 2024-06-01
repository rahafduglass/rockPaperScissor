package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        play();
    }
    public static void play(){
        System.out.println("Lets play rock paper scissor, \n Choose your move....\"rock, paper, scissor\"");
        StringBuilder userMove = new StringBuilder();
        userMove.append(input.next());
        RockPaperScissor rockPaperScissorGame= new RockPaperScissor();
        rockPaperScissorGame.setUserMove(userMove);
        rockPaperScissorGame.printMoves();
        StringBuilder result= rockPaperScissorGame.whoWins();
        System.out.println(result);
        System.out.println();
        System.out.println("wanna play again??? (y/n)");
        String playAgain= input.next();
        if(playAgain.charAt(0)=='y'){
            play();
        }
    }
}