package ch.hslu.oop.sw07;

import java.util.Objects;

public class Temperature {
    private double celsius;

    public Temperature() {
        this(20);
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getKelvin() {
        return celsius + 273.15;
    }

    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setTemperature(double temperature, Unit unit) {
        switch (unit) {
            case Celsius:
                this.celsius = temperature;
                break;
            case Kelvin:
                this.celsius = temperature - 273.15;
                break;
            case Fahrenheit:
                this.celsius = (temperature - 32) / 1.8;
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(celsius, that.celsius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(celsius);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "celsius=" + celsius +
                '}';
    }
}
