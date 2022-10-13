package be.intecbrussel;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {

    public static void main(String[] args) {

        Instant epochDate = Instant.EPOCH;
        System.out.println(epochDate);

        Instant now = Instant.now();
        System.out.println(now);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now(); //similar to instant but local
        System.out.println(ldt);

        LocalDateTime oldDate = LocalDateTime.of(2022, 8, 8, 20, 57, 39);
        System.out.println(oldDate);

        DateTimeFormatter rom = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String myFormatDate = ldt.format(rom);
        System.out.println(myFormatDate);

/////////////////////////////////////////////////////////////////////////////////////////////////


        LocalDateTime newDate1 = LocalDateTime.of(2022, 11, 9, 23, 56, 59);
        LocalDateTime oldDate1 = LocalDateTime.of(1003, 7, 19, 7, 32, 46);

        Duration timeSec = Duration.ofHours(24); // or .ofDays()
        System.out.println(timeSec.getSeconds() + " seconds");

        Duration difference = Duration.between(oldDate1, newDate1);
        System.out.println(difference.getSeconds() + " seconds");

        Period timeDay = Period.ofDays(23).plusDays(7); //or .ofMonths().plusMonths()
        System.out.println(timeDay.getDays() + " days");

        /////////////////////////////////////////////////////////////////////////////////////////

        LocalDate newDate2 = LocalDate.of(2022, 11, 24);
        LocalDate oldDate2 = LocalDate.of(2001, 9, 2);

        Period per = Period.between(oldDate2, newDate2);

        System.out.println(per.getYears() + " years");
        System.out.println(per.getMonths() + " months");
        System.out.println(per.getDays() + " days");

        //////////////////////////////////////////////////////////////////////////////////////////////////:

        long mil = ChronoUnit.MILLENNIA.between(oldDate1, newDate1);
        long cen = ChronoUnit.CENTURIES.between(oldDate1, newDate1);
        long dec = ChronoUnit.DECADES.between(oldDate1, newDate1);
        long ye = ChronoUnit.YEARS.between(oldDate1, newDate1);
        long mon = ChronoUnit.MONTHS.between(oldDate1, newDate1);
        long we = ChronoUnit.WEEKS.between(oldDate1, newDate1);
        long da = ChronoUnit.DAYS.between(oldDate1, newDate1);
        long ho = ChronoUnit.HOURS.between(oldDate1, newDate1);
        long min = ChronoUnit.MINUTES.between(oldDate1, newDate1);
        long sec = ChronoUnit.SECONDS.between(oldDate1, newDate1);

        System.out.println(mil + " millenia");
        System.out.println(cen + " centuries");
        System.out.println(dec + " decades");
        System.out.println(ye + " years");
        System.out.println(mon + " months");
        System.out.println(we + " weeks");
        System.out.println(da + " days");
        System.out.println(ho + " hours");
        System.out.println(min + " minutes");
        System.out.println(sec + " seconds");


        ChronoUnit chrono = ChronoUnit.valueOf("MONTHS");

        Duration dur = chrono.getDuration();

        System.out.println("Duration Estimated: " + dur);








    }
}
