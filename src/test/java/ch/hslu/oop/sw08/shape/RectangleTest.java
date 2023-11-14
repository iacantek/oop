package ch.hslu.oop.sw08.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testGetPerimeterZero() {
        int width = 0, height = 0;
        var rectangle = new Rectangle(0, 0, width, height);

        assertEquals((2 * width) + (2 * height), rectangle.getPerimeter());
    }

    @Test
    void testGetPerimeter() {
        int width = 1, height = 2;
        var rectangle = new Rectangle(0, 0, width, height);

        assertEquals((2 * width) + (2 * height), rectangle.getPerimeter());
    }

    @Test
    void testGetPerimeterNotEqual() {
        int width = 1, height = 2;
        var rectangle = new Rectangle(0, 0, width, height);

        assertNotEquals((2 * -1) + (2 * -2), rectangle.getPerimeter());
    }

    @Test
    void testToString() {
        int x = 1, y = -1, width = 5, height = 6;
        var rectangle = new Rectangle(x, y, width, height);

        assertEquals("Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}', rectangle.toString());
    }
}