package Package.com.player.statelevel;

import Package.Playable;
import Package.Player;

public class CricketPlayer extends Player implements Playable {

    @Override
    public void play() {
        System.out.print("Playing with a CRICKET BALL");
    }

    public void batting() {
        System.out.println("Batting WITH A CRICKET BALL");
    }

    public void bowling() {
        System.out.println("Bowling");
    }

    // Override batting method to accept any Player object
    public void batting(Player player) {
        System.out.print(player.getClass().getSimpleName() + " is batting");
        if (player instanceof CricketPlayer) {
            System.out.print(" WITH A CRICKET BALL");
        } else if (player instanceof FootBallPlayer) {
            System.out.print(" WITH A FOOT BALL");
        } else if (player instanceof TennisPlayer) {
            System.out.print(" WITH A TENNIS BALL");
        } else if (player instanceof ChessPlayer) {
            System.out.print(" WITH A CHESS DOT");
        }
        System.out.println();
    }
}
