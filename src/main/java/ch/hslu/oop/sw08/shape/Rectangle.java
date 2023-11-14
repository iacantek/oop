package ch.hslu.oop.sw08.shape;

public final class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(final int x, final int y,
                     final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * Gets perimeter of square based on width and height.
     * @return perimeter of rectangle.
     */
    @Override
    public int getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

    /**
     * Gets string of object.
     * @return object formatted as string.
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}