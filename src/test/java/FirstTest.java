import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FirstTest {

    @Test
    void SomeTest() {
        String date = "23.05.2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        LocalDate parse = localDate;

        Assertions.assertEquals( DayOfWeek.FRIDAY, localDate.getDayOfWeek());
    }
}
