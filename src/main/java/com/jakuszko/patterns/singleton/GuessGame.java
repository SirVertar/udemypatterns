package com.jakuszko.patterns.singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int score;
    private static GuessGame instance;

    private GuessGame() {
        score = 0;
    }

    public static GuessGame getInstance() {
        if (instance == null) {
            synchronized (GuessGame.class) {
                if (instance == null) {
                    instance = new GuessGame();
                }
            }
        }
        return  instance;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean end = false;
        int computerNumber;
        int playerNumber;
        Random generator = new Random();
        while (!end) {
            System.out.println("Give your number...");
            playerNumber = scanner.nextInt();
            computerNumber = generator.nextInt(10);
            if (computerNumber == playerNumber) {
                System.out.println("Computer score is: " + computerNumber + " You have additional point");
                score++;
                System.out.println("Score: " + score);
            } else {
                System.out.println("The computer score is " + computerNumber + " :(" );
            }
            if (score == 10) {
                score = 0;
                end = true;
            }
        }
    }

    public int getScore () {
        return score;
    }
}
