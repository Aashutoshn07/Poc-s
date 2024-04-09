package Package.com.player.statelevel;

import Package.Playable;
import Package.Player;

public class TennisPlayer extends Player implements Playable {

    public void shot() {
        System.out.println("Making a shot");
    }

    @Override
    public void play() {
        System.out.print("Playing with a TENNIS BALL");
    }
    
}
