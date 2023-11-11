package ch.hslu.oop.sw03;

public class Point {
    private int x;
    private int y;

    /**
     * 1.g)
     * Creates a new coordinate.
     * @param x Coordinate x
     * @param y Coordinate y
     */
    public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    /**
     * 1.h)
     * Returns the quadrant the coordinate is located in.
     * @return Number of quadrant
     */
    public int getQuadrant() {
        if (x >= 0 && y >= 0) {
            return 1;
        }
        else if (x <= 0 && y >= 0) {
            return 2;
        }
        else if (x <= 0 && y <= 0) {
            return 3;
        }

        return 4;
    }
}
