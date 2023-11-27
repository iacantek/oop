package ch.hslu.oop.sw10.base;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class PropertyChange {
    private final List<PropertyChangeListener> changeListeners;

    public PropertyChange() {
        this.changeListeners = new ArrayList<>();
    }

    /**
     * registers a PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.add(listener);
    }

    /**
     * unregisters a PropertyChangeListener.
     * @param listener PropertyChangeListener.
     */
    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        this.changeListeners.remove(listener);
    }

    /**
     * fires off the property changed event for all listeners.
     * @param e PropertyChangeEvent
     */
    protected void firePropertyChangeEvent(final PropertyChangeEvent e) {
        for (final PropertyChangeListener listener : this.changeListeners) {
            listener.propertyChange(e);
        }
    }
}
