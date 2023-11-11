package ch.hslu.oop.sw05;

public interface Switchable {
    /**
     * Switches on object.
     */
    void switchOn();

    /**
     * Switches off object.
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
