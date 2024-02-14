import org.junit.Test;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testDateinfo() {

        String dateString = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateString);

        assertEquals(2023,offsetDateTime.getYear());
        assertEquals(3,offsetDateTime.getMonthValue());
        assertEquals(1,offsetDateTime.getDayOfMonth());
        assertEquals(DayOfWeek.WEDNESDAY, offsetDateTime.getDayOfWeek());

    }

}

