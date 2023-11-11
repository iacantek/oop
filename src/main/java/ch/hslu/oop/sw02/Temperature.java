package ch.hslu.oop.sw02;

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

    // e.)
    public double getKelvin() {
        return celsius + 273.15;
    }

    // f.)
    public double getFahrenheit() {
        return celsius * 1.8 + 32;
    }

    // d.)
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

    // 1.d)
    public String getAggregationState(String element) {
        // name of element, its boiling and fusion temperature
        Dictionary<String, double[]> elements = new Hashtable<>();
        elements.put("N", new double[] { -196, -210 });
        elements.put("Hg", new double[] { 357, -39 });
        elements.put("Pb", new double[] { 1750, -327.43 });

        double[] temperatures = elements.get(element);

        if (temperatures == null) {
            return "Not a valid element!";
        }

        return getAggregationState(temperatures[0], temperatures[1]);
    }

    private String getAggregationState(double boilingTemperature, double fusionTemperature) {
        String aerially = "gasförmig";
        String liquid = "flüssig";
        String firm = "fest";

        if (celsius >= boilingTemperature) {
            return aerially;
        }
        else if (celsius >= fusionTemperature) {
            return liquid;
        }
        return firm;
    }
}
