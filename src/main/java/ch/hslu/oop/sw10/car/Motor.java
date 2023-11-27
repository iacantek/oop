package ch.hslu.oop.sw10.car;

import ch.hslu.oop.sw10.base.PropertyChange;

import java.beans.PropertyChangeEvent;
import java.util.Objects;

public class Motor extends PropertyChange implements Switchable, Comparable<Motor>
{
    private static final int RPM_BASE = 1000;
    private static final int RPM_OFF = 0;
    private int rpm;

    @Override
    public void switchOn() {
        if (this.isSwitchedOff()) {
            rpm = RPM_BASE;
            this.firePropertyChangeEvent(new PropertyChangeEvent(this, "rpm", RPM_OFF, RPM_BASE));
        }
    }

    @Override
    public void switchOff() {
        if (this.isSwitchedOn()) {
            rpm = RPM_OFF;
            this.firePropertyChangeEvent(new PropertyChangeEvent(this, "rpm", RPM_BASE, RPM_OFF));
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return rpm > RPM_OFF;
    }

    @Override
    public boolean isSwitchedOff() {
        return rpm == RPM_OFF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motor motor = (Motor) o;
        return rpm == motor.rpm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rpm);
    }

    @Override
    public String toString() {
        return "Motor{" +
                "rpm=" + rpm +
                '}';
    }

    @Override
    public int compareTo(Motor o) {
        return 0;
    }
}
