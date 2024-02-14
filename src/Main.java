import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        String stringa3 = "2023-03-01T13:00:00Z";

        OffsetDateTime offsetDateTime = OffsetDateTime.parse(stringa3);

        int anno =offsetDateTime.getYear();

        int mese = offsetDateTime.getMonthValue();

        int giorno = offsetDateTime.getDayOfMonth();

        DayOfWeek giornoDellaSett = offsetDateTime.getDayOfWeek();

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + giornoDellaSett);



    }
}