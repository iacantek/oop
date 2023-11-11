package ch.hslu.oop.sw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OOPMathTest {
    @Test
    public void testMaxTwoDifferentValues1() {
        assertEquals(2, OOPMath.max(1, 2));
    }

    @Test
    public void testMaxTwoDifferentValues2() {
        assertEquals(4, OOPMath.max(4, 3));
    }

    @Test
    public void testMaxTwoSameValues() {
        assertEquals(5, OOPMath.max(5, 5));
    }

    @Test
    public void testMaxThreeDifferentValues1() {
        assertEquals(3, OOPMath.max(1, 2, 3));
    }

    @Test
    public void testMaxThreeDifferentValues2() {
        assertEquals(6, OOPMath.max(4, 6, 5));
    }

    @Test
    public void testMaxThreeDifferentValues3() {
        assertEquals(7, OOPMath.max(7, 6, 5));
    }

    @Test
    public void testMaxTwoSameOneDifferentValue1() {
        assertEquals(8, OOPMath.max(8, 8, 5));
    }

    @Test
    public void testMaxTwoSameOneDifferentValue2() {
        assertEquals(9, OOPMath.max(8, 9, 9));
    }

    @Test
    public void testMaxTwoSameOneDifferentValue3() {
        assertEquals(10, OOPMath.max(10, 9, 10));
    }

    @Test
    public void testMaxThreeSameValues() {
        assertEquals(10, OOPMath.max(10, 10, 10));
    }
}