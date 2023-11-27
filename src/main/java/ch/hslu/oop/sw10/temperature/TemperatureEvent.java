package ch.hslu.oop.sw10.temperature;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class TemperatureEvent {
    private static final List<PropertyChangeListener> CHANGE_LISTENERS = new ArrayList<>();;

    /**
     * registers a PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public static void addPropertyChangeListener(final PropertyChangeListener listener) {
        CHANGE_LISTENERS.add(listener);
    }

    /**
     * unregisters a PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public static void removePropertyChangeListener(final PropertyChangeListener listener) {
        CHANGE_LISTENERS.remove(listener);
    }

    /**
     * fires off the property changed event for all listeners.
     * @param e PropertyChangeEvent
     */
    protected static void firePropertyChangeEvent(final PropertyChangeEvent e) {
        for (final PropertyChangeListener listener : CHANGE_LISTENERS) {
            listener.propertyChange(e);
        }
    }
}
