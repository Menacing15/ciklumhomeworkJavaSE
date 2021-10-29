package ua.aleksandr.ciklumhomework.DateTime;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {

    static Logger log = Logger.getLogger(ParsingDateTime.class.getName());

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("08 11 2002", formatter);
        LocalTime time = LocalTime.parse("00:00");

        log.info("Date " + date.format(formatter));
        log.info("Time " + time);

        LocalDate myDate = LocalDate.of(2002, Month.NOVEMBER, 20);
        log.info(formatter.format(myDate));

        LocalDate anotherDate = LocalDate.parse(formatter.format(myDate), formatter);
        anotherDate = anotherDate.plusMonths(1).plusDays(1);
        log.info(formatter.format(anotherDate));
    }
}
