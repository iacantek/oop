package ch.hslu.oop.sw08.temperature;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    private static final double KELVIN_OFFSET = 273.15d;
    private static final double DEFAULT_CELSIUS = 30;
    private static Temperature defaultTemperature;

    @BeforeAll
    public static void initTemperature() {
        defaultTemperature = new Temperature(DEFAULT_CELSIUS);
    }

    @Test
    void testConstructor() {
        var temperature = new Temperature();

        assertEquals(20, temperature.getCelsius());
    }

    @Test
    void testGetTemperatureCelsius() {
        var temperature = new Temperature(DEFAULT_CELSIUS);

        assertEquals(DEFAULT_CELSIUS, temperature.getTemperature(TemperatureUnit.Celsius));
    }

    @Test
    void testGetTemperatureKelvin() {
        var temperature = new Temperature(DEFAULT_CELSIUS);

        assertEquals(DEFAULT_CELSIUS + KELVIN_OFFSET, temperature.getTemperature(TemperatureUnit.Kelvin));
    }

    @Test
    void testGetTemperatureFahrenheit() {
        var temperature = new Temperature(DEFAULT_CELSIUS);

        assertEquals(DEFAULT_CELSIUS * 1.8 + 32, temperature.getTemperature(TemperatureUnit.Fahrenheit));
    }

    @Test
    void testGetCelsius() {
        var temperature = new Temperature(DEFAULT_CELSIUS);

        assertEquals(temperature.getTemperature(TemperatureUnit.Celsius), temperature.getCelsius());
    }

    @Test
    void testGetKelvin() {
        var temperature = new Temperature(DEFAULT_CELSIUS);

        assertEquals(temperature.getTemperature(TemperatureUnit.Kelvin), temperature.getKelvin());
    }

    @Test
    void testGetFahrenheit() {
        var temperature = new Temperature(DEFAULT_CELSIUS);

        assertEquals(temperature.getTemperature(TemperatureUnit.Fahrenheit), temperature.getFahrenheit());
    }

    @Test
    void testSetCelsius() {
        final double celsius = 35;
        var temperature = new Temperature();
        temperature.setCelsius(celsius);

        assertEquals(celsius, temperature.getCelsius());
    }

    @Test
    void testSetTemperatureCelsius() {
        final double celsius = 35;
        var temperature = new Temperature();
        temperature.setTemperature(celsius, TemperatureUnit.Celsius);

        assertEquals(celsius, temperature.getCelsius());
    }

    @Test
    void testSetTemperatureKelvin() {
        final double kelvin = 35;
        var temperature = new Temperature();
        temperature.setTemperature(kelvin, TemperatureUnit.Kelvin);

        assertEquals(kelvin, temperature.getKelvin());
    }

    @Test
    void testSetTemperatureFahrenheit() {
        final double fahrenheit = 35;
        var temperature = new Temperature();
        temperature.setTemperature(fahrenheit, TemperatureUnit.Fahrenheit);

        assertEquals(fahrenheit, temperature.getFahrenheit());
    }

    @Test
    void testConvertCelsiusToKelvin() {
        assertEquals(defaultTemperature.getKelvin(), Temperature.convertCelsiusToKelvin(defaultTemperature.getCelsius()));
    }

    @Test
    void testConvertCelsiusToFahrenheit() {
        assertEquals(defaultTemperature.getFahrenheit(), Temperature.convertCelsiusToFahrenheit(defaultTemperature.getCelsius()));
    }

    @Test
    void testConvertKelvinToCelsius() {
        assertEquals(defaultTemperature.getCelsius(), Temperature.convertKelvinToCelsius(defaultTemperature.getKelvin()));
    }

    @Test
    void testConvertFahrenheitToCelsius() {
        assertEquals(defaultTemperature.getCelsius(), Temperature.convertFahrenheitToCelsius(defaultTemperature.getFahrenheit()));
    }

    @Test
    void testEquals() {
        var compareTemperature = new Temperature(DEFAULT_CELSIUS);

        assertTrue(defaultTemperature.equals(compareTemperature));
    }

    @Test
    void testNotEquals() {
        var compareTemperature = new Temperature(DEFAULT_CELSIUS + 1);

        assertFalse(defaultTemperature.equals(compareTemperature));
    }

    @Test
    void testEqualHashCode() {
        var compareTemperature = new Temperature(DEFAULT_CELSIUS);

        assertEquals(defaultTemperature.hashCode(), compareTemperature.hashCode());
    }

    @Test
    void testNotEqualHashCode() {
        var compareTemperature = new Temperature(DEFAULT_CELSIUS + 1);

        assertNotEquals(defaultTemperature.hashCode(), compareTemperature.hashCode());
    }
}