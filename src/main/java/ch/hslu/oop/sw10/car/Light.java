package ch.hslu.oop.sw10.car;

import ch.hslu.oop.sw04.Switchable;
import ch.hslu.oop.sw10.base.PropertyChange;

import java.beans.PropertyChangeEvent;
import java.util.Objects;

public class Light extends PropertyChange implements Switchable, Comparable<Light> {
    private boolean switchedOn = false;
    @Override
    public void switchOn() {
        switchedOn = true;
        this.firePropertyChangeEvent(new PropertyChangeEvent(this, "switchedOn", false, true));
    }

    @Override
    public void switchOff() {
        switchedOn = false;
        this.firePropertyChangeEvent(new PropertyChangeEvent(this, "switchedOn", true, false));
    }

    @Override
    public boolean isSwitchedOn() {
        return switchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !switchedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Light light = (Light) o;
        return switchedOn == light.switchedOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchedOn);
    }

    @Override
    public String toString() {
        return "Light{" +
                "switchedOn=" + switchedOn +
                '}';
    }

    @Override
    public int compareTo(Light o) {
        return 0;
    }
}
