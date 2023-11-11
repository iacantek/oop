package ch.hslu.oop.sw04;

public class Point {
    private int x;
    private int y;

    public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public void setY(final int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // 1.h)
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
