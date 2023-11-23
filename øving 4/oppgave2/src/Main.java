import java.util.Random;

public class Main {
    public static void main(String[] args) {
        player a = new player("Anders", 0, false);
        player b = new player("Borgis", 0, false);

        Random dice = new Random();
        int round = 1;

        while (true) {
            System.out.println("Runde " + round);
            a.throwDice(dice);
            b.throwDice(dice);


            if (a.getPlayerScore() >= 100) {
                System.out.println(a.getName()  + " vant! Det tok " + a.getDiceAmount() + " kast.");
                break;
            } else if (b.getPlayerScore() >= 100) {
                System.out.println(b.getName() +  " vant! det tok" + b.getDiceAmount() + " kast.");
                break;
            }

            round++;
        }
    }
}


