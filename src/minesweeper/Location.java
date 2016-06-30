package minesweeper;

public class Location {

    private int xMax;
    private int yMax;

    public Location(int xMin, int xMax, int yMin, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public int getXMax() {
        return xMax;
    }

    public int getYMax() {
        return yMax;
    }
}
