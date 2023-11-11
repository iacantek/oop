package ch.hslu.oop.sw06;

public class Element {
    private double boilingTemperature;
    private double fusionTemperature;

    public Element(double boilingTemperature, double fusionTemperature) {
        this.boilingTemperature = boilingTemperature;
        this.fusionTemperature = fusionTemperature;
    }

    public double getBoilingTemperature() {
        return this.boilingTemperature;
    }

    public double getFusionTemperature() {
        return this.fusionTemperature;
    }

    @Override
    public String toString() {
        return "Element{" +
                "boilingTemperature=" + boilingTemperature +
                ", fusionTemperature=" + fusionTemperature +
                '}';
    }
}
