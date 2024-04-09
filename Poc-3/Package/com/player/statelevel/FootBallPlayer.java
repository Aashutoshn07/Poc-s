package Package.com.player.statelevel;

import Package.Playable;
import Package.Player;

public class FootBallPlayer extends Player implements Playable {
    public void kick() {
        System.out.println("Kicking the ball");
    }

    public void corner() {
        System.out.println("Taking a corner");
    }

    @Override
    public void play() {
        System.out.print("Playing with a FOOT BALL");
    }
}