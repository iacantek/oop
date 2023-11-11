package ch.hslu.oop.sw04;

public class Light implements Switchable {
    private boolean switchedOn = false;
    @Override
    public void switchOn() {
        switchedOn = true;
    }

    @Override
    public void switchOff() {
        switchedOn = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return switchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !switchedOn;
    }
}
