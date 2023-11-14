package ch.hslu.oop.sw08.shape;

public final class Circle extends Shape {
    private int radius;
    public Circle(final int x, final int y,
                  final int radius) {
        super(x, y);
        this.radius = radius;
    }

    /**
     * Gets perimeter of circle based on radius.
     * @return perimeter of circle.
     */
    @Override
    public int getPerimeter() {
        return (int)(2 * Math.PI * this.radius);
    }

    /**
     * Gets string of object.
     * @return object formatted as string.
     */
    @Override
    public String toString() {
        return "Circle{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", radius=" + radius +
                '}';
    }
}
