package ch.hslu.oop.sw08.shape;

public final class Square extends Shape {
    private int side;
    public Square(final int x, final int y,
                  final int side) {
        super(x, y);
        this.side = side;
    }

    /**
     * Gets perimeter of square based on side.
     * @return perimeter of square.
     */
    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    /**
     * Gets string of object.
     * @return object formatted as string.
     */
    @Override
    public String toString() {
        return "Square{" +
                "x=" + getX() +
                ", y=" + getY() +
                ", side=" + side +
                '}';
    }
}
