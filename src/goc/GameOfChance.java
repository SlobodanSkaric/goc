package goc;

public class GameOfChance {
    public static void main(String srgs[]){
        PlayerId pid = new PlayerId();
        Player player = new Player("Slobodan",1000, pid.getPlayerId());
        player.genratePlayer();
    }
}
