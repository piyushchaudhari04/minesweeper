package minesweeper;

public class MineSweeperGame {
    private Player player;


    public MineSweeperGame(Player player) {
        this.player = player;
    }

    public void start(char mode){
        player.select(mode);

    }
}
