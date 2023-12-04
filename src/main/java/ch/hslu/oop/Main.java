package ch.hslu.oop;

import ch.hslu.oop.sw10.temperature.Temperature;
import ch.hslu.oop.sw10.temperature.TemperatureTrend;
import ch.hslu.oop.sw11.FileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.util.Scanner;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        var fileName = "sw11_text";

        FileManager.writeTextFile(fileName);
        FileManager.readTextFile(fileName);

//        String input;
//        Scanner scanner = new Scanner(System.in);
//
//        TemperatureTrend.addPropertyChangeListener(Main::handleEvent);
//
//        do {
//            System.out.println("Bitte Temperatur in Celsius eingeben (oder 'exit' zum Beenden): ");
//            input = scanner.next();
//            String message;
//            try {
//                var temperature = Temperature.createFromCelsius(Double.parseDouble(input));
//                TemperatureTrend.add(temperature);
//                message = temperature.toString();
//                LOG.info(message);
//            }
//            catch (Exception ex) {
//                message = "Not a valid input: " + input;
//                LOG.error(message);
//            }
//        } while (!"exit".equals(input));
//
//        System.out.println("Programm beendet.");
//        System.out.println(new TemperatureTrend());
    }

    private static void handleEvent(final PropertyChangeEvent e) {
        LOG.info(e.getSource() + " property has changed: " + e.getPropertyName() + " (" + e.getOldValue() + " -> " + e.getNewValue() + ")");
    }
}