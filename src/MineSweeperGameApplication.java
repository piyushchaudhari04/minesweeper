import minesweeper.*;

import java.util.Scanner;

public class MineSweeperGameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FieldData fieldData=new FieldData(3);
        fieldData.fillData(scanner);
        MineField mineField=new MineField(new Location(0,3,0,3));
        String option = scanner.next();
        char mode = option.charAt(0);
        int x = (int) option.charAt(2);
        int y = (int) option.charAt(4);

        Position position = new Position(x-48, y-48);
        MineDetector mineDetector = new MineDetector();
        Player player=new Player(position,mineDetector,fieldData,mineField);
        MineSweeperGame mineSweeperGame=new MineSweeperGame(player);
        mineSweeperGame.start(mode);
    }

}
