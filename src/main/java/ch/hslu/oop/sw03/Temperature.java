package ch.hslu.oop.sw03;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;

public class Temperature {
    private double celsius;

    public Temperature() {
        celsius = 20;
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


}
