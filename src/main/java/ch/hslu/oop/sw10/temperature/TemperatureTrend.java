package ch.hslu.oop.sw10.temperature;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TemperatureTrend extends TemperatureEvent {
    private static final Collection<Temperature> TEMPERATURES = new ArrayList<>();

    /**
     * Returns all saved temperatures.
     *
     * @return array list of temperature objects
     */
    public static Collection<Temperature> getTemperatures() {
        return TEMPERATURES;
    }

    /**
     * Adds temperature object to collections.
     *
     * @param temperature object to add.
     */
    public static void add(Temperature temperature) {
        var oldMin = TemperatureTrend.min();
        var oldMax = TemperatureTrend.max();

        TEMPERATURES.add(temperature);

        var min = TemperatureTrend.min();
        var max = TemperatureTrend.max();

        // min temperature has changed
        if (oldMin != min) {
            firePropertyChangeEvent(new PropertyChangeEvent(TemperatureEvent.class, "min", oldMin, min));
        }

        // max temperature has changed
        if (oldMax != max) {
            firePropertyChangeEvent(new PropertyChangeEvent(TemperatureEvent.class, "max", oldMax, max));
        }
    }

    /**
     * Clears collection.
     */
    public static void clear() {
        TEMPERATURES.clear();
    }

    /**
     * Gets number of objects in collection.
     *
     * @return collection size.
     */
    public static int getCount() {
        return TEMPERATURES.size();
    }

    /**
     * Gets minimal temperature.
     *
     * @return temperature in celsius (0 if collection is empty).
     */
    public static double min() {
        return min(TemperatureUnit.Celsius);
    }

    /**
     * Gets minimal temperature.
     *
     * @param unit celsius, kelvin or fahrenheit.
     * @return temperature in given unit (0 if collection is empty).
     */
    public static double min(TemperatureUnit unit) {
        if (TEMPERATURES.isEmpty())
            return Double.NaN;

        return Collections.min(TEMPERATURES).getTemperature(unit);
    }

    /**
     * Gets maximal temperature.
     *
     * @return temperature in celsius (0 if collection is empty).
     */
    public static double max() {
        return max(TemperatureUnit.Celsius);
    }

    /**
     * Gets maximal temperature.
     *
     * @param unit celsius, kelvin or fahrenheit.
     * @return temperature in given unit (0 if collection is empty).
     */
    public static double max(TemperatureUnit unit) {
        if (TEMPERATURES.isEmpty())
            return Double.NaN;

        return Collections.max(TEMPERATURES).getTemperature(unit);
    }

    /**
     * Gets average temperature in collection.
     *
     * @return temperature in celsius (0 if collection is empty).
     */
    public static double average() {
        return average(TemperatureUnit.Celsius);
    }

    /**
     * Gets average temperature in collection.
     *
     * @param unit celsius, kelvin or fahrenheit.
     * @return temperature in given unit (0 if collection is empty).
     */
    public static double average(TemperatureUnit unit) {
        return TEMPERATURES.stream()
                .mapToDouble(t -> t.getTemperature(unit))
                .average()
                .orElse(Double.NaN);
    }

    @Override
    public String toString() {
        return "TemperatureTrend{" +
                "count=" + TEMPERATURES.size() +
                ", average=" + average() +
                ", min=" + min() +
                ", max=" + max() +
                '}';
    }
}
