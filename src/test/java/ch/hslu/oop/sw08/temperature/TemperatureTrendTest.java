package ch.hslu.oop.sw08.temperature;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureTrendTest {
    private static final Double[] TEMPERATURE_VALUES = { 5d, 10d, 15d, 20d, 25d, 30d };
    private static final Double LOWEST_TEMPERATURE = 5d;
    private static final Double AVERAGE_TEMPERATURE = 17.5d;
    private static final Double HIGHEST_TEMPERATURE = 30d;

    // clear static set after each test
    @AfterEach
    void clearTemperatures() {
        TemperatureTrend.clear();
    }

    @Test
    void testAdd() {
        final Temperature temperature = new Temperature(30d);
        TemperatureTrend.add(temperature);

        assertEquals(1, TemperatureTrend.getCount());
    }

    @Test
    void testAddDuplicateValue() {
        final Temperature temperature = new Temperature(30d);
        TemperatureTrend.add(temperature);
        TemperatureTrend.add(temperature);

        assertEquals(1, TemperatureTrend.getCount());
    }

    @Test
    void testClear() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        TemperatureTrend.clear();

        assertEquals(0, TemperatureTrend.getCount());
    }

    @Test
    void testGetCount() {
        final int count = 10;

        for (int i = 0; i < count; i++) {
            TemperatureTrend.add(new Temperature(i));
        }

        assertEquals(count, TemperatureTrend.getCount());
    }

    @Test
    void testMin() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(LOWEST_TEMPERATURE, TemperatureTrend.min());
    }

    @Test
    void testMinNoValues() {
        assertEquals(0, TemperatureTrend.min());
    }

    @Test
    void testMinSameValues() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(LOWEST_TEMPERATURE, TemperatureTrend.min());
    }

    @Test
    void testMinCelsius() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(LOWEST_TEMPERATURE, TemperatureTrend.min(TemperatureUnit.Celsius));
    }

    @Test
    void testMinKelvin() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(Temperature.convertCelsiusToKelvin(LOWEST_TEMPERATURE), TemperatureTrend.min(TemperatureUnit.Kelvin));
    }

    @Test
    void testMinFahrenheit() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(Temperature.convertCelsiusToFahrenheit(LOWEST_TEMPERATURE), TemperatureTrend.min(TemperatureUnit.Fahrenheit));
    }

    @Test
    void testMax() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(HIGHEST_TEMPERATURE, TemperatureTrend.max());
    }

    @Test
    void testMaxNoValues() {
        assertEquals(0, TemperatureTrend.max());
    }

    @Test
    void testMaxSameValues() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(HIGHEST_TEMPERATURE, TemperatureTrend.max());
    }

    @Test
    void testMaxCelsius() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(HIGHEST_TEMPERATURE, TemperatureTrend.max(TemperatureUnit.Celsius));
    }

    @Test
    void testMaxKelvin() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(Temperature.convertCelsiusToKelvin(HIGHEST_TEMPERATURE), TemperatureTrend.max(TemperatureUnit.Kelvin));
    }

    @Test
    void testMaxFahrenheit() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(Temperature.convertCelsiusToFahrenheit(HIGHEST_TEMPERATURE), TemperatureTrend.max(TemperatureUnit.Fahrenheit));
    }

    @Test
    void testAverage() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(AVERAGE_TEMPERATURE, TemperatureTrend.average());
    }

    @Test
    void testAverageNoValues() {
        assertEquals(0, TemperatureTrend.average());
    }

    @Test
    void testAverageCelsius() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(AVERAGE_TEMPERATURE, TemperatureTrend.average(TemperatureUnit.Celsius));
    }

    @Test
    void testAverageKelvin() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(Temperature.convertCelsiusToKelvin(AVERAGE_TEMPERATURE), TemperatureTrend.average(TemperatureUnit.Kelvin));
    }

    @Test
    void testAverageFahrenheit() {
        for(Double temperature : TEMPERATURE_VALUES) {
            TemperatureTrend.add(new Temperature(temperature));
        }

        assertEquals(Temperature.convertCelsiusToFahrenheit(AVERAGE_TEMPERATURE), TemperatureTrend.average(TemperatureUnit.Fahrenheit));
    }
}