package ch.hslu.oop.sw05;

public abstract class Shape {
    private int x;
    private int y;
    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }
    public final void move(final int newX, final int newY) {
        this.x = newX;
        this.y = newY;
    }
    public abstract int getPerimeter();

    @Override
    public String toString() {
        return String.format("Coordinates: (%o/%o)\nPerimenter: %o", x, y, getPerimeter());
    }
}