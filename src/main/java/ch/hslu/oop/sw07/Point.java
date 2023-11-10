package ch.hslu.oop.sw07;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    public int getQuadrant() {
        if (x == 0 || y == 0){
            return -1;
        }
        else if (x > 0 && y > 0) {
            return 1;
        }
        else if (x < 0 && y > 0) {
            return 2;
        }
        else if (x < 0) {
            return 3;
        }

        return 4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
