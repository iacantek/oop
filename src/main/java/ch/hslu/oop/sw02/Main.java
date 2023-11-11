package ch.hslu.oop.sw02;

import java.io.Console;
import java.nio.file.spi.FileSystemProvider;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String output = "%s, %f Celsius: %s\n";
        String n = "N";
        String hg = "Hg";
        String pb = "Pb";

        var temperature = new Temperature();

        // 0 celsius
        double temp1 = 0;
        temperature.setTemperature(temp1, Unit.Celsius);
        System.out.printf(output, n, temp1, temperature.getAggregationState(n));
        System.out.printf(output, hg, temp1, temperature.getAggregationState(hg));
        System.out.printf(output + "\n", pb, temp1, temperature.getAggregationState(pb));

        // 500 celsius
        double temp2 = 500;
        temperature.setTemperature(temp2, Unit.Celsius);
        System.out.printf(output, n, temp2, temperature.getAggregationState(n));
        System.out.printf(output, hg, temp2, temperature.getAggregationState(hg));
        System.out.printf(output + "\n", pb, temp2, temperature.getAggregationState(pb));

        // -300 celsius
        double temp3 = -300;
        temperature.setTemperature(temp3, Unit.Celsius);
        System.out.printf(output, n, temp3, temperature.getAggregationState(n));
        System.out.printf(output, hg, temp3, temperature.getAggregationState(hg));
        System.out.printf(output + "\n", pb, temp3, temperature.getAggregationState(pb));
    }
}