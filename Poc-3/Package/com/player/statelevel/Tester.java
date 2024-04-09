package Package.com.player.statelevel;

public class Tester {
    public static void main(String[] args) {
        CricketPlayer ganguly = new CricketPlayer();
        ganguly.batting(ganguly);
        
        FootBallPlayer player1 = new FootBallPlayer();
        TennisPlayer player2 = new TennisPlayer();
        ChessPlayer player3 = new ChessPlayer();

        ganguly.batting(player1);
        ganguly.batting(player2);
        ganguly.batting(player3);
    }
}
