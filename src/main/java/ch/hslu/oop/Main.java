package ch.hslu.oop;

import ch.hslu.oop.sw10.temperature.Temperature;
import ch.hslu.oop.sw10.temperature.TemperatureTrend;
import ch.hslu.oop.sw11.FileManager;
import ch.hslu.oop.sw12.Person;
import ch.hslu.oop.sw12.PersonCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.util.Scanner;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
//        var collection = new PersonCollection();
//        var collection2 = new PersonCollection();
//
//        for (var i = 0; i < 10; i++) {
//            collection.add(new Person(i, "First " + i, "Last " + i));
//        }
//
//        final Person min = collection.getPeople()
//                .stream()
//                .min(Person::compareTo)
//                .orElse(null);
//
//        final Person max = collection.getPeople()
//                .stream()
//                .max(Person::compareTo)
//                .orElse(null);
//
//        final Person max2 = collection2.getPeople()
//                .stream()
//                .max(Person::compareTo)
//                .orElse(null);
//
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(max2);

        var fileName = "temperatures.bin";

        String input;
        Scanner scanner = new Scanner(System.in);

        TemperatureTrend.addPropertyChangeListener(Main::handleEvent);

        do {
            System.out.println("Bitte Temperatur in Celsius eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            String message;
            try {
                var temperature = Temperature.createFromCelsius(Double.parseDouble(input));
                TemperatureTrend.add(temperature);
                message = temperature.toString();
                LOG.info(message);
            } catch (Exception ex) {
                message = "Not a valid input: " + input;
                LOG.error(message);
            }
        } while (!"exit".equals(input));

        System.out.println("Programm beendet.");
        System.out.println(new TemperatureTrend());

        FileManager.writeTextFile(fileName, TemperatureTrend.getCount());
        for (Temperature temperature : TemperatureTrend.getTemperatures()) {
            FileManager.writeTextFile(fileName, temperature.getCelsius());
        }

        FileManager.readTextFile(fileName);
    }

    private static void handleEvent(final PropertyChangeEvent e) {
        LOG.info(e.getSource() + " property has changed: " + e.getPropertyName() + " (" + e.getOldValue() + " -> " + e.getNewValue() + ")");
    }
}