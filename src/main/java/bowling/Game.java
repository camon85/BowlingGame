package main.java.bowling;

public class Game {
    private int score;

    public void roll(int pins) {
        this.score += pins;
    }

    public int getScore() {
        return this.score;
    }
}
