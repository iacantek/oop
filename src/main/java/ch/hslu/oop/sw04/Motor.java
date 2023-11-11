package ch.hslu.oop.sw04;

public class Motor implements Switchable
{
    private static final int RPM_BASE = 1000;
    private static final int RPM_OFF = 1000;
    private int rpm;

    @Override
    public void switchOn() {
        if (this.isSwitchedOff()) {
            rpm = RPM_BASE;
        }
    }

    @Override
    public void switchOff() {
        if (this.isSwitchedOn()) {
            rpm = RPM_OFF;
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
}
