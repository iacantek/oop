package ch.hslu.oop.sw08.temperature;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class TemperatureTrend {
    private static final Collection<Temperature> TEMPERATURES = new HashSet<>();

    public static void add(Temperature temperature) {
        TEMPERATURES.add(temperature);
    }

    public static void clear() {
        TEMPERATURES.clear();
    }

    public static int getCount() {
        return TEMPERATURES.size();
    }

    public static double min()
    {
        return min(TemperatureUnit.Celsius);
    }

    public static double min(TemperatureUnit unit) {
        if (TEMPERATURES.isEmpty())
            return 0;

        return Collections.min(TEMPERATURES).getTemperature(unit);
    }

    public static double max() {
        return max(TemperatureUnit.Celsius);
    }

    public static double max(TemperatureUnit unit) {
        if (TEMPERATURES.isEmpty())
            return 0;

        return Collections.max(TEMPERATURES).getTemperature(unit);
    }

    public static double average() {
        return average(TemperatureUnit.Celsius);
    }

    public static double average(TemperatureUnit unit) {
        if (TEMPERATURES.isEmpty())
            return 0;

        return TEMPERATURES.stream()
                .mapToDouble(t -> t.getTemperature(unit))
                .average()
                .orElse(0.0);
    }
}
