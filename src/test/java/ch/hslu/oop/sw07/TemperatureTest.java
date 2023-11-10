package ch.hslu.oop.sw07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private static final double celsius = 20;
    private static Temperature temperature;

    @BeforeAll
    public static void initTemperature() {
        temperature = new Temperature(celsius);
    }

    @Test
    public void testEquals() {
        var compareTemperature = new Temperature(celsius);

        assertTrue(temperature.equals(compareTemperature));
    }

    @Test
    public void testNotEquals() {
        var compareTemperature = new Temperature(celsius + 1);

        assertFalse(temperature.equals(compareTemperature));
    }

    @Test
    public void testEqualHashCode() {
        var compareTemperature = new Temperature(celsius);

        assertEquals(temperature.hashCode(), compareTemperature.hashCode());
    }

    @Test
    public void testNotEqualHashCode() {
        var compareTemperature = new Temperature(celsius + 1);

        assertNotEquals(temperature.hashCode(), compareTemperature.hashCode());
    }
}