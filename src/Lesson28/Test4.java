package Lesson28;
import java.time.*;

public class Test4 {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate date = nachalo;
        while (date.isBefore(konec)) {
            System.out.println("Nastupila data " + date + ". Pora menyat' dejurnogo");
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalTime lt = LocalTime.of(20, 30);
        Period p = Period.of(1, 3, 15);
        lt.plus(p);
        LocalDate nachalo = LocalDate.of(2016, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2017, Month.MAY, 31);

        smenaDejurnogo(nachalo, konec, p);
    }
}
