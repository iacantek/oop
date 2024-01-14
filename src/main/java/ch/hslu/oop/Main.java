package ch.hslu.oop;

import ch.hslu.oop.sw08.temperature.Temperature;
import ch.hslu.oop.sw10.temperature.TemperatureTrend;
import ch.hslu.oop.sw11.DateTimeConverter;
import ch.hslu.oop.sw11.FileManager;
import ch.hslu.oop.sw11.MeasurementTrend;
import ch.hslu.oop.sw11.MeasuringPoint;
import ch.hslu.oop.sw12.Person;
import ch.hslu.oop.sw12.PersonCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
//            } catch (Exception ex) {
//                message = "Not a valid input: " + input;
//                LOG.error(message);
//            }
//        } while (!"exit".equals(input));
//
//        System.out.println("Programm beendet.");
//        System.out.println(new TemperatureTrend());
//
//        FileManager.writeBinaryFile(TemperatureTrend.getCount());
//        for (Temperature temperature : TemperatureTrend.getTemperatures()) {
//            FileManager.writeBinaryFile(temperature.getCelsius());
//        }
//
//        FileManager.readBinaryFile();


//        var path = FileManager.getFullPath("sw11_2");
//
//        if (new File(path).exists()) {
//            try (BufferedReader br =
//                         new BufferedReader(new InputStreamReader(
//                                 new FileInputStream(path), Charset.forName("UTF-8")))) {
//                String line;
//                while ((line = br.readLine()) != null) {
//                    var lineArr = line.split(";");
//
//                    MeasurementTrend.add(
//                            new MeasuringPoint(
//                                    new Temperature(Double.parseDouble(lineArr[2])),
//                                    DateTimeConverter.convertString(lineArr[1])
//                            )
//                    );
//                }
//            } catch (IOException ioe) {
//                LOG.error(ioe.getMessage(), ioe);
//            }
//        } else {
//            LOG.error("File does not exist!");
//        }
//
//        System.out.println("Lowest temperature: " + MeasurementTrend.min().getTemperature().getCelsius() + " at " + MeasurementTrend.min().getTimeStamp());
//        System.out.println("Highest temperature: " + MeasurementTrend.max().getTemperature().getCelsius() + " at " + MeasurementTrend.max().getTimeStamp());
//
//        System.out.println("Average temperature: " + MeasurementTrend.average());
    }

    private static void handleEvent(final PropertyChangeEvent e) {
        LOG.info(e.getSource() + " property has changed: " + e.getPropertyName() + " (" + e.getOldValue() + " -> " + e.getNewValue() + ")");
    }
}