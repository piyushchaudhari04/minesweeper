package minesweeper;

public class MineField {

    private Location location;

    public MineField(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
