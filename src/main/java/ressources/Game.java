package main.java.ressources;

public class Game {
    private int rolls[]=new int[21];
    private int currentRoll=0;

    // roll: called each time the player rolls the ball.
    public void roll(int numberOfPinsKnockedDown) {
        rolls[currentRoll++]=numberOfPinsKnockedDown;
    }

    public int score() {
        int score=0;
        int i = 0;
        for (int frame = 0; frame < 10; frame++)  {
            int scoreByFrame=rolls[i] + rolls[i+1];
            if(isSpareOrStrike(scoreByFrame)) { // spare case
                score += rolls[i+2];
            }
            if(isSpareOrStrike(rolls[i])) { // strike case
                score += rolls[i+1] + rolls[i+2];
            }
            score += scoreByFrame;
            i += 2;
        }
        return score;
    }

    private boolean isSpareOrStrike(int scoreByFrameOrRoll) {
        if(scoreByFrameOrRoll==10) {
            return true;
        }else {
            return false;
        }
    }
}