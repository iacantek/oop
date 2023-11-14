package ch.hslu.oop.sw08.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testGetX() {
        int x = 1;
        Shape shape = new Circle(x, 0, 0);

        assertEquals(x, shape.getX());
    }

    @Test
    void testGetY() {
        int y = 1;
        Shape shape = new Circle(0, y, 0);

        assertEquals(y, shape.getY());
    }

    @Test
    void testMove() {
        int x = 2, y = 1;
        Shape shape = new Circle(0, 0, 0);
        shape.move(x, y);

        assertEquals(x, shape.getX());
        assertEquals(y, shape.getY());
    }

    @Test
    void testMoveNotEquals() {
        int x = 2, y = 1;
        Shape shape = new Circle(x, y, 0);
        shape.move(0, 0);

        assertNotEquals(x, shape.getX());
        assertNotEquals(y, shape.getY());
    }
}