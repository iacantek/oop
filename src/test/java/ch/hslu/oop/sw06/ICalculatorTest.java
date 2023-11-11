package ch.hslu.oop.sw06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ICalculatorTest {
    private static ICalculator calculator;

    @BeforeAll
    public static void instanceCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testAdditionZero() {
        assertEquals(0, calculator.addition(0, 0));
    }

    @Test
    public void testAdditionPositive() {
        assertEquals(3, calculator.addition(1, 2));
    }

    @Test
    public void testAdditionNegative() {
        assertEquals(-9, calculator.addition(-4, -5));
    }

    @Test
    public void testAdditionPositiveNegative() {
        assertEquals(-1, calculator.addition(6, -7));
    }

    @Test
    public void testAdditionNegativePositive() {
        assertEquals(1, calculator.addition(-8, 9));
    }

    @Test
    public void testAdditionIntMax() {
        calculator.addition(1, Integer.MAX_VALUE);
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }

    @Test
    public void testAdditionNegativeIntMax() {

        calculator.addition(-1, -Integer.MAX_VALUE);
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("One");
        });
    }
}