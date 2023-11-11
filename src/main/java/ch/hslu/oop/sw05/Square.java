package ch.hslu.oop.sw05;

public class Square extends Shape {
    private int side;
    public Square(final int x, final int y,
                  final int side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }
}
