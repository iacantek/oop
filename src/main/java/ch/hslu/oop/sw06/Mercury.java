package ch.hslu.oop.sw06;

public class Mercury extends Element {
    public Mercury(double boilingTemperature, double fusionTemperature) {
        super(boilingTemperature, fusionTemperature);
    }

    @Override
    public String toString() {
        return "GIFTIG " + super.toString();
    }
}

