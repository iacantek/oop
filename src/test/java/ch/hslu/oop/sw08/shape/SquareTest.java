package ch.hslu.oop.sw08.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testGetPerimeterZero() {
        int side = 0;
        var square = new Square(0, 0, side);

        assertEquals(4 * side, square.getPerimeter());
    }

    @Test
    void testGetPerimeter() {
        int side = 3;
        var square = new Square(0, 0, side);

        assertEquals(4 * side, square.getPerimeter());
    }

    @Test
    void testGetPerimeterNotEqual() {
        var square = new Square(0, 0, 3);

        assertNotEquals(4 * 4, square.getPerimeter());
    }

    @Test
    void testToString() {
        int x = 1, y = -1, side = 7;
        var square = new Square(x, y, side);

        assertEquals("Square{" +
                "x=" + x +
                ", y=" + y +
                ", side=" + side +
                '}', square.toString());
    }
}