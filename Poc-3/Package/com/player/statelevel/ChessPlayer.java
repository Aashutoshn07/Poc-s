package Package.com.player.statelevel;

import Package.Playable;
import Package.Player;

public class ChessPlayer extends Player implements Playable {

    public void moveTheDot() {
        System.out.println("Moving the chess dot");
    }

    @Override
    public void play() {
        System.out.print("Playing with a CHESS DOT");
    }
    
}
