package ch.hslu.oop.sw07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private static final int x = 0, y = 0;
    private static Point point;

    @BeforeAll
    public static void initPoint() {
        point = new Point(x, y);
    }

    @Test
    void testEquals() {
        var comparePoint = new Point(x, y);

        assertTrue(point.equals(comparePoint));
    }

    @Test
    void testNotEqualsX() {
        var comparePoint = new Point(x + 1, y);

        assertFalse(point.equals(comparePoint));
    }

    @Test
    void testNotEqualsY() {
        var comparePoint = new Point(x, y + 1);

        assertFalse(point.equals(comparePoint));
    }

    @Test
    void testEqualHashCode() {
        var comparePoint = new Point(x, y);

        assertEquals(point.hashCode(), comparePoint.hashCode());
    }

    @Test
    void testNotEqualHashCodeX() {
        var comparePoint = new Point(x + 1, y);

        assertNotEquals(point.hashCode(), comparePoint.hashCode());
    }

    @Test
    void testNotEqualHashCodeY() {
        var comparePoint = new Point(x, y + 1);

        assertNotEquals(point.hashCode(), comparePoint.hashCode());
    }
}