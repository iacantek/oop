package ch.hslu.oop.sw10.car;

public interface Switchable {
    /**
     * Switches on.
     */
    void switchOn();

    /**
     * Switches off.
     */
    void switchOff();

    /**
     * Gets value if object is switched on.
     * @return True if object is switched on, else false
     */
    boolean isSwitchedOn();

    /**
     * Gets value if object is switched off.
     * @return True if object is switched off, else false
     */
    boolean isSwitchedOff();
}
