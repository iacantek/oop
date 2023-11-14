package ch.hslu.oop.sw08.shape;

public abstract class Shape {
    private int x;
    private int y;
    protected Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets x-coordinate of object.
     * @return x-coordinate.
     */
    protected int getX() {
        return this.x;
    }

    /**
     * Gets y-coordinate of object.
     * @return y-coordinate.
     */
    protected int getY() {
        return this.y;
    }

    /**
     * Moves shape to a new position.
     * @param newX new x-coordinate.
     * @param newY new y-coordinate.
     */
    public final void move(final int newX, final int newY) {
        this.x = newX;
        this.y = newY;
    }

    public abstract int getPerimeter();

    public abstract String toString();
}