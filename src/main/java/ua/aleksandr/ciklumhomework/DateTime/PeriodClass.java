package ua.aleksandr.ciklumhomework.DateTime;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class PeriodClass {

    static Logger log = Logger.getLogger(Period.class.getName());

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2002, Month.NOVEMBER, 8);
        LocalDate end = LocalDate.of(2002, Month.NOVEMBER, 20);
        Period period = Period.ofDays(3);

        // start.toEpochDay(); number of days since January 1970

        cleanAnimalCage(start, end, period);

        log.info(start.plus(period));
        log.info(LocalDateTime.now().plus(period));

        //Period yearAndMonth = Period.ofYears(1).ofMonths(1);
        Period yearAndMonth = Period.of(10, 0, 0);
        log.info(yearAndMonth);
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            log.info("Need to do some sports: " + start);
            start = start.plus(period);
        }
    }
}

