package ch.hslu.oop.sw08.temperature;

import java.util.Objects;

public final class Temperature implements Comparable<Temperature> {
    private static final double KELVIN_OFFSET = 273.15d;
    private double celsius;

    public Temperature() {
        this(20);
    }

    public Temperature(final Temperature temperature) {
        this(temperature.getCelsius());
    }

    public Temperature(final double celsius) {
        this.setCelsius(celsius);
    }

    /**
     * Gets current temperature based on given unit.
     * @param unit celsius, kelvin or fahrenheit.
     * @return temperature based on given unit.
     */
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

    /**
     * Gets temperature in celsius.
     * @return celisus.
     */
    public double getCelsius() {
        return getTemperature(TemperatureUnit.Celsius);
    }

    /**
     * Gets temperature in kelvin.
     * @return kelvin.
     */
    public double getKelvin() {
        return getTemperature(TemperatureUnit.Kelvin);
    }

    /**
     * Gets temperature in fahrenheit.
     * @return fahrenheit.
     */
    public double getFahrenheit() {
        return getTemperature(TemperatureUnit.Fahrenheit);
    }

    /**
     * Sets temperature in celsius.
     * @param celsius temperature in celsius.
     */
    public void setCelsius(final double celsius) {
        this.celsius = celsius;
    }

    /**
     * Sets temperature based on given unit.
     * @param temperature temperature.
     * @param unit celsius, kelvin or fahrenheit.
     */
    public void setTemperature(final double temperature, final TemperatureUnit unit) {
        switch (unit) {
            case Celsius:
                this.setCelsius(temperature);
                break;
            case Kelvin:
                this.setCelsius(convertKelvinToCelsius(temperature));
                break;
            case Fahrenheit:
                this.setCelsius(convertFahrenheitToCelsius(temperature));
                break;
        }
    }

    /**
     * Converts celsius to kelvin.
     * @param celsius temperature in celsius.
     * @return temperature in kelvin.
     */
    public static double convertCelsiusToKelvin(final double celsius) {
        return celsius + KELVIN_OFFSET;
    }

    /**
     * Converts celsius to fahrenheit.
     * @param celsius temperature in celsius.
     * @return temperature in fahrenheit.
     */
    public static double convertCelsiusToFahrenheit(final double celsius) {
        return celsius * 1.8 + 32;
    }

    /**
     * Converts kelvin to celsius.
     * @param kelvin temperature in kelvin.
     * @return temperature in celsius.
     */
    public static double convertKelvinToCelsius(final double kelvin) {
        return kelvin - KELVIN_OFFSET;
    }

    /**
     * Converts fahrenheit to celsius.
     * @param fahrenheit temperature in fahrenheit.
     * @return temperature in celsius.
     */
    public static double convertFahrenheitToCelsius(final double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    /**
     * Compares temperature object to any other object
     * @param o the object to be compared.
     * @return true if equals, else false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(this.celsius, that.celsius) == 0;
    }

    /**
     * Gets hashcode based on attributes.
     * @return hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.celsius);
    }

    /**
     * Gets string of object.
     * @return object formatted as string.
     */
    @Override
    public String toString() {
        return "Temperature{" +
                "celsius=" + this.celsius +
                '}';
    }

    /**
     * Gets integer which states if compared object is "lower" or "higher".
     * @param o the object to be compared.
     * @return result of comparison.
     */
    @Override
    public int compareTo(Temperature o) {
        if (this == o) return 0;
        return Double.compare(this.celsius, o.celsius);
    }
}
