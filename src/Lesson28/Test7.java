package Lesson28;

import java.time.*;
import java.time.format.*;

public class Test7 {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    void smena(LocalDateTime ldt, LocalDateTime ldt2, Period p, Duration d) {
        while (ldt.isBefore(ldt2)) {
            System.out.print("Rabotaem s: " + ldt.format(f));
            ldt = ldt.plus(p);
            System.out.println(" Do: " + ldt.format(f));
            System.out.print("Otdihaem s: " + ldt.format(f1));
            ldt = ldt.plus(d);
            System.out.println(" Do: " + ldt.format(f1));
        }
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9, 0, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 31, 18, 0, 0);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofMinutes(600);
        Test7 t = new Test7();
        t.smena(ldt1, ldt2, p, d);
    }
}
