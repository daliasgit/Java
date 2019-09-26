package com.example.java;

public class Main {

    public static void main(String[] args) {
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;
        boolean gameOver = true;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("The final score is " + finalScore);
        }
    }
}
