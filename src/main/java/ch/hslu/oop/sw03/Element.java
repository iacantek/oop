package ch.hslu.oop.sw03;

public class Element {
    private String name;
    private double boilingTemperature;
    private double fusionTemperature;

    public Element(String name, double boilingTemperature, double fusionTemperature) {
        this.name = name;
        this.boilingTemperature = boilingTemperature;
        this.fusionTemperature = fusionTemperature;
    }

    public String getName() {
        return this.name;
    }

    public double getBoilingTemperature() {
        return this.boilingTemperature;
    }

    public double getFusionTemperature() {
        return this.fusionTemperature;
    }
}
