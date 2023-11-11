package ch.hslu.oop.sw04;

public class Vehicle {
    private Motor motor = new Motor();;
    private Light light = new Light();

    public Motor getMotor() {
        return this.motor;
    }

    public Light getLight() {
        return this.light;
    }
}
