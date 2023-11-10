package ch.hslu.oop.sw08.temperature;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    private static final double KELVIN_OFFSET = 273.15d;
    private double celsius;

    public Temperature() {
        this(20);
    }

    public Temperature(final double celsius) {
        this.celsius = celsius;
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

    public void setCelsius(final double celsius) {
        this.celsius = celsius;
    }

    public void setTemperature(final double temperature, final TemperatureUnit unit) {
        switch (unit) {
            case Celsius:
                this.celsius = temperature;
                break;
            case Kelvin:
                this.celsius = convertKelvinToCelsius(temperature);
                break;
            case Fahrenheit:
                this.celsius = convertFahrenheitToCelsius(temperature);
                break;
        }
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
