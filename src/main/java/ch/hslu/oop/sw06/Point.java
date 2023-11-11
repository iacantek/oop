package ch.hslu.oop.sw06;

public class Point {
    private int x;
    private int y;

    public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    public Point(final Point point){
        this(point.getX(), point.getY());
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

    public void moveRelative(final int x, final int y) {
        setX(this.x + x);
        setY(this.y + y);
    }

    public void moveRelative(Point point) {
        setX(this.x + point.x);
        setY(this.y + point.y);
    }

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
