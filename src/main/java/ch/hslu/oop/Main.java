package ch.hslu.oop;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import ch.hslu.oop.sw09.temperature.Temperature;

import java.util.Scanner;

public class Main {
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        // SW09
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            String message;
            try {
                var temperature = Temperature.createFromCelsius(Double.parseDouble(input));
                message = temperature.toString();
                LOG.info(message);
            }
            catch (Exception ex) {
                message = "Not a valid input: " + input;
                LOG.error(message);
            }

            System.out.println(message);
        } while (!"exit".equals(input));
        System.out.println("Programm beendet.");
    }
}