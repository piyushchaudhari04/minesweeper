package minesweeper;

public class MineDetector {


    public boolean detect(Position squarePosition, FieldData fieldData) {

        return fieldData.getSquareContent(squarePosition) == 'm';
    }

    public int findAdjacentMines(Position squarePosition, FieldData fieldData, MineField mineField) {
        char[][] fieldDetail = fieldData.getFieldData();
        int x = squarePosition.getXCoordinate();
        int y = squarePosition.getYCoordinate();
        int mineCount = 0;
        Location location = mineField.getLocation();
        if (y > 0 && fieldDetail[x][y - 1] == 'm') {
            mineCount++;
        }
        if (y < location.getYMax() && fieldDetail[x][y + 1] == 'm') {
            mineCount++;
        }
        if (x > 0 && fieldDetail[x - 1][y] == 'm') {
            mineCount++;
        }
        if (x < location.getXMax() && fieldDetail[x + 1][y] == 'm') {
            mineCount++;
        }
        return mineCount;
    }
}
