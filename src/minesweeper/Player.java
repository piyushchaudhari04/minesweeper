package minesweeper;

public class Player {

    private Position position;
    private MineDetector mineDetector;
    private FieldData fieldData;
    private MineField mineField;

    public Player(Position position, MineDetector mineDetector, FieldData fieldData, MineField mineField) {
        this.position = position;
        this.mineDetector = mineDetector;
        this.fieldData = fieldData;
        this.mineField = mineField;
    }

    public void select(char mode) {
        Position squarePosition=position;
        if (mineDetector.detect(squarePosition, fieldData) && mode != 'f') {
            System.out.println("OOPs you stepped on a mine game over");
        } else {
            if (mode == 'f') {
                fieldData.addFlag(squarePosition);
            } else {
                int mineCount = mineDetector.findAdjacentMines(squarePosition, fieldData, mineField);
                fieldData.update(squarePosition, mineCount);
                System.out.println(fieldData);
            }
        }
    }
}
