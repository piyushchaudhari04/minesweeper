package minesweeper;

import java.util.Arrays;
import java.util.Scanner;

public class FieldData {

    private char[][] fieldData;
    private int fieldSize;

    public FieldData(int fieldSize) {
        this.fieldSize = fieldSize;
        fieldData = new char[fieldSize][fieldSize];
    }

    public void fillData(Scanner scanner) {
        for (int i = 0; i < fieldSize; i++) {
            String tempString = scanner.next();
            System.out.println(tempString);
            char[] tempArray = tempString.toCharArray();
            for (int j = 0; j < fieldSize; j++) {
                fieldData[i][j] = tempArray[j];
            }
        }
    }

    public char getSquareContent(Position squarePosition) {
        return fieldData[squarePosition.getXCoordinate()][squarePosition.getYCoordinate()];
    }

    @Override
    public String toString() {
        return "FieldData{" +
                "fieldData=" + Arrays.toString(fieldData) +
                '}';
    }

    public void addFlag(Position squarePosition) {
        fieldData[squarePosition.getXCoordinate()][squarePosition.getYCoordinate()] = 'f';
    }

    public char[][] getFieldData() {
        return fieldData;
    }

    public void update(Position squarePosition, int mineCount) {
        fieldData[squarePosition.getXCoordinate()][squarePosition.getYCoordinate()] = (char) mineCount;
    }
}
