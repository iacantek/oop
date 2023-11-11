package ch.hslu.oop.sw05;

public class CountingSwitchable implements Switchable {
    private boolean isSwitchedOn;
    private long switchCount;
    public CountingSwitchable() {
        this.isSwitchedOn = false;
        this.switchCount = 0;
    }

    @Override
    public void switchOn() {
        this.isSwitchedOn = true;
        this.switchCount++;
    }

    @Override
    public void switchOff() {
        this.isSwitchedOn = false;
        this.switchCount++;
    }

    @Override
    public boolean isSwitchedOn() {
        return this.isSwitchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !this.isSwitchedOn;
    }

    public long getSwitchCount() {
        return this.switchCount;
    }
}
