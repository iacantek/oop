package ch.hslu.oop.sw09.temperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private static final double KELVIN_OFFSET = 273.15d;
    private static final double DEFAULT_CELSIUS = 30;

    @Test
    void testCreateFromCelsius() {
        var temperature = Temperature.createFromCelsius(DEFAULT_CELSIUS);
        assertInstanceOf(Temperature.class, temperature);
        assertEquals(DEFAULT_CELSIUS, temperature.getCelsius());
    }

    @Test
    void testCreateFromKelvin() {
        var temperature = Temperature.createFromKelvin(DEFAULT_CELSIUS);
        assertInstanceOf(Temperature.class, temperature);
        assertEquals(DEFAULT_CELSIUS, temperature.getKelvin());
    }

    @Test
    void testCreateFromFahrenheit() {
        var temperature = Temperature.createFromFahrenheit(DEFAULT_CELSIUS);
        assertInstanceOf(Temperature.class, temperature);
        assertEquals(DEFAULT_CELSIUS, temperature.getFahrenheit());
    }

    @Test
    void testCreateFromCelsiusInvalidTemperature() {
        final Double temperature = -KELVIN_OFFSET - 1;
        final Exception e =
            assertThrows(IllegalArgumentException.class, () -> {
                Temperature.createFromCelsius(temperature);
            });

        assertEquals("Not a valid temperature: " + temperature + "°C", e.getMessage());
    }

    @Test
    void testCreateFromKelvinInvalidTemperature() {
        final Double temperature = -KELVIN_OFFSET - 1;
        final Exception e =
            assertThrows(IllegalArgumentException.class, () -> {
                Temperature.createFromKelvin(Temperature.convertCelsiusToKelvin(temperature));
            });

        assertEquals("Not a valid temperature: " + temperature + "°C", e.getMessage());
    }

    @Test
    void testCreateFromFahrenheitInvalidTemperature() {
        final Double temperature = -KELVIN_OFFSET - 1;
        final Exception e =
            assertThrows(IllegalArgumentException.class, () -> {
                Temperature.createFromFahrenheit(Temperature.convertCelsiusToFahrenheit(temperature));
            });

        assertEquals("Not a valid temperature: " + temperature + "°C", e.getMessage());
    }
}