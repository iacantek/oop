package ch.hslu.oop.sw08.temperature;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class TemperatureTrend {
    private static final Collection<Temperature> TEMPERATURES = new HashSet<>();

    /**
     * Adds temperature object to collections.
     * @param temperature object to add.
     */
    public static void add(Temperature temperature) {
        TEMPERATURES.add(temperature);
    }

    /**
     * Clears collection.
     */
    public static void clear() {
        TEMPERATURES.clear();
    }

    /**
     * Gets number of objects in collection.
     * @return collection size.
     */
    public static int getCount() {
        return TEMPERATURES.size();
    }

    /**
     * Gets minimal temperature.
     * @return temperature in celsius (0 if collection is empty).
     */
    public static double min()
    {
        return min(TemperatureUnit.Celsius);
    }

    /**
     * Gets minimal temperature.
     * @param unit celsius, kelvin or fahrenheit.
     * @return temperature in given unit (0 if collection is empty).
     */
    public static double min(TemperatureUnit unit) {
        if (TEMPERATURES.isEmpty())
            return 0;

        return Collections.min(TEMPERATURES).getTemperature(unit);
    }

    /**
     * Gets maximal temperature.
     * @return temperature in celsius (0 if collection is empty).
     */
    public static double max() {
        return max(TemperatureUnit.Celsius);
    }

    /**
     * Gets maximal temperature.
     * @param unit celsius, kelvin or fahrenheit.
     * @return temperature in given unit (0 if collection is empty).
     */
    public static double max(TemperatureUnit unit) {
        if (TEMPERATURES.isEmpty())
            return 0;

        return Collections.max(TEMPERATURES).getTemperature(unit);
    }

    /**
     * Gets average temperature in collection.
     * @return temperature in celsius (0 if collection is empty).
     */
    public static double average() {
        return average(TemperatureUnit.Celsius);
    }

    /**
     * Gets average temperature in collection.
     * @param unit celsius, kelvin or fahrenheit.
     * @return temperature in given unit (0 if collection is empty).
     */
    public static double average(TemperatureUnit unit) {
        return TEMPERATURES.stream()
                .mapToDouble(t -> t.getTemperature(unit))
                .average()
                .orElse(0.0);
    }
}
