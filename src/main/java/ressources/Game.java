ackage main.java.ressources;

public class Game {
    private int rolls[]=new int[21];
    private int currentRoll=0;

    // roll: called each time the player rolls the ball.
    public void roll(int numberOfPinsKnockedDown) {
        rolls[currentRoll++]=numberOfPinsKnockedDown;
    }

    public int score() {
        int score=0;
        return score;
    }

}