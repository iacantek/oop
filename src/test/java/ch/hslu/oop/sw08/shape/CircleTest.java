package ch.hslu.oop.sw08.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testGetPerimeterZero() {
        int radius = 0;
        var circle = new Circle(0, 0, radius);

        assertEquals((int)(2 * Math.PI * radius), circle.getPerimeter());
    }

    @Test
    void testGetPerimeter() {
        int radius = 2;
        var circle = new Circle(0, 0, radius);

        assertEquals((int)(2 * Math.PI * radius), circle.getPerimeter());
    }

    @Test
    void testGetPerimeterNotEqual() {
        var circle = new Circle(0, 0, -1);

        assertNotEquals((int)(2 * Math.PI * 2), circle.getPerimeter());
    }

    @Test
    void testToString() {
        int x = 1, y = -1, radius = 5;
        var circle = new Circle(x, y, radius);

        assertEquals("Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}', circle.toString());
    }
}