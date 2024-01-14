package ch.hslu.oop.sw11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeConverter {
    public static LocalDateTime convertString(final String dateTime) {
        return LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));
    }
}
