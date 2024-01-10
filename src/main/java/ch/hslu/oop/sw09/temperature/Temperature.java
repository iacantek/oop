package ch.hslu.oop.sw09.temperature;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    private static final double KELVIN_OFFSET = 273.15d;
    private final double celsius;

    private Temperature() {
        this(20);
    }

    private Temperature(final double celsius) {
        if (celsius < -KELVIN_OFFSET) throw new IllegalArgumentException("Not a valid temperature: " + celsius + "°C");

        this.celsius = celsius;
    }

    public static Temperature createFromCelsius(final double celsius) {
        return new Temperature(celsius);
    }

    public static Temperature createFromKelvin(final double kelvin) {
        return new Temperature(convertKelvinToCelsius(kelvin));
    }

    public static Temperature createFromFahrenheit(final double fahrenheit) {
        return new Temperature(convertFahrenheitToCelsius(fahrenheit));
    }

    public static double convertCelsiusToKelvin(final double celsius) {
        return celsius + KELVIN_OFFSET;
    }

    public static double convertCelsiusToFahrenheit(final double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double convertKelvinToCelsius(final double kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    public static double convertFahrenheitToCelsius(final double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public double getTemperature(final TemperatureUnit unit) {
        switch (unit) {
            case Celsius -> {
                return this.celsius;
            }
            case Kelvin -> {
                return convertCelsiusToKelvin(this.celsius);
            }
            case Fahrenheit -> {
                return convertCelsiusToFahrenheit(this.celsius);
            }
        }
        return 0;
    }

    public double getCelsius() {
        return getTemperature(TemperatureUnit.Celsius);
    }

    public double getKelvin() {
        return getTemperature(TemperatureUnit.Kelvin);
    }

    public double getFahrenheit() {
        return getTemperature(TemperatureUnit.Fahrenheit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(this.celsius, that.celsius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.celsius);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "celsius=" + this.celsius +
                '}';
    }

    @Override
    public int compareTo(Temperature o) {
        if (this == o) return 0;
        return Double.compare(this.celsius, o.celsius);
    }
}
