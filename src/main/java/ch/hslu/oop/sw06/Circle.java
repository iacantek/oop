package ch.hslu.oop.sw06;

public class Circle extends Shape {
    private int radius;
    public Circle(final int x, final int y,
                  final int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getDiameter() { return 2 * radius; }

    @Override
    public int getPerimeter() {
        return (int)(2 * Math.PI * this.radius);
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nRadius: %o\n", radius);
    }
}
