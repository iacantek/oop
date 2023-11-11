package ch.hslu.oop.sw06;

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(final int x, final int y,
                     final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

    @Override
    public double getDiameter() {
        return Math.sqrt((width * width) + (height * height));
    }
}
