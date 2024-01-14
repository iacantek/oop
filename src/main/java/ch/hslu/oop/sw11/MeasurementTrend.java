package ch.hslu.oop.sw11;

import ch.hslu.oop.sw10.temperature.TemperatureEvent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MeasurementTrend extends TemperatureEvent {
    private static final Collection<MeasuringPoint> MEASUREMENTS = new ArrayList<>();

    /**
     * Returns all saved MEASUREMENTS.
     *
     * @return array list of temperature objects
     */
    public static Collection<MeasuringPoint> getMEASUREMENTS() {
        return MEASUREMENTS;
    }

    /**
     * Adds temperature object to collections.
     *
     * @param measuringPoint object to add.
     */
    public static void add(MeasuringPoint measuringPoint) {
        MEASUREMENTS.add(measuringPoint);
    }

    /**
     * Clears collection.
     */
    public static void clear() {
        MEASUREMENTS.clear();
    }

    /**
     * Gets number of objects in collection.
     *
     * @return collection size.
     */
    public static int getCount() {
        return MEASUREMENTS.size();
    }

    /**
     * Gets minimal temperature.
     *
     * @return temperature in celsius (0 if collection is empty).
     */
    public static MeasuringPoint min() {
        if (MEASUREMENTS.isEmpty())
            return null;

        return Collections.min(MEASUREMENTS);
    }

    /**
     * Gets maximal temperature.
     *
     * @return temperature in celsius (0 if collection is empty).
     */
    public static MeasuringPoint max() {
        if (MEASUREMENTS.isEmpty())
            return null;

        return Collections.max(MEASUREMENTS);
    }

    /**
     * Gets average temperature in collection.
     *
     * @return temperature in celsius (0 if collection is empty).
     */
    public static double average() {
        return MEASUREMENTS.stream()
                .mapToDouble(t -> t.getTemperature().getCelsius())
                .average()
                .orElse(Double.NaN);
    }

    @Override
    public String toString() {
        return "TemperatureTrend{" +
                "count=" + MEASUREMENTS.size() +
                ", average=" + average() +
                ", min=" + min() +
                ", max=" + max() +
                '}';
    }
}
