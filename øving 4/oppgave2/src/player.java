import java.util.Random;

public class player {
    final String name;
    int playerScore;
    boolean hasWon;
    int diceAmount;

    public player(String name, int playerScore, boolean hasWon) {
        this.name = name;
        this.playerScore = playerScore;
        this.hasWon = hasWon;
        this.diceAmount = 0;
    }

    public void throwDice(Random dice) {
        int diceValue = dice.nextInt(6) + 1;

        if (diceValue == 1) {
            playerScore = 0;
            diceAmount = 0;
        } else {
            playerScore += diceValue;
            diceAmount++;
        }
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getDiceAmount() {
        return diceAmount;
    }

    public String getName() {
        return name;
    }
}
