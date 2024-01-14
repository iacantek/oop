package ch.hslu.oop.sw11;

import ch.hslu.oop.sw08.temperature.Temperature;

import java.time.LocalDateTime;

public class MeasuringPoint implements Comparable<MeasuringPoint> {
    private Temperature temperature;
    private LocalDateTime timeStamp;

    public MeasuringPoint(final Temperature temperature, final LocalDateTime timeStamp) {
        this.temperature = temperature;
        this.timeStamp = timeStamp;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    @Override
    public int compareTo(MeasuringPoint o) {
        if (this == o) return 0;
        return Double.compare(this.temperature.getCelsius(), o.getTemperature().getCelsius());
    }

    @Override
    public String toString() {
        return "MeasuringPoint{" +
                "temperature=" + temperature +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
