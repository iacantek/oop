package ch.hslu.oop.sw10.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private static final Logger LOG = LoggerFactory.getLogger(Car.class);
    private final Motor motor;
    private final Light light;

    public Car() {
        this(new Motor(), new Light());
    }

    public Car(Motor motor) {
        this(motor, new Light());
    }

    public Car(Light light) {
        this(new Motor(), light);
    }

    public Car(Motor motor, Light light) {
        this.motor = motor;
        this.motor.addPropertyChangeListener(this::handleEvent);
        this.light = light;
        this.light.addPropertyChangeListener(this::handleEvent);
    }

    public final Motor getMotor() {
        return this.motor;
    }

    public final Light getLight() {
        return this.light;
    }

    public void handleEvent(final PropertyChangeEvent e) {
        LOG.info(e.getSource() + " property has changed: " + e.getPropertyName() + " (" + e.getOldValue() + " -> " + e.getNewValue() + ")");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(motor, car.motor) && Objects.equals(light, car.light);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motor, light);
    }

    @Override
    public String toString() {
        return "Car{" +
                "motor=" + motor +
                ", light=" + light +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }
}
