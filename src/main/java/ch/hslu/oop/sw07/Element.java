package ch.hslu.oop.sw07;

import java.util.Objects;

public abstract class Element {
    private final double boilingTemperature;
    private final double fusionTemperature;

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
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Double.compare(boilingTemperature, element.boilingTemperature) == 0 && Double.compare(fusionTemperature, element.fusionTemperature) == 0;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(boilingTemperature, fusionTemperature);
    }

    @Override
    public String toString() {
        return "Element{" +
                "boilingTemperature=" + boilingTemperature +
                ", fusionTemperature=" + fusionTemperature +
                '}';
    }
}
