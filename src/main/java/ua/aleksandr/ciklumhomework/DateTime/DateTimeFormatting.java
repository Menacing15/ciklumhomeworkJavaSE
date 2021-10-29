package ua.aleksandr.ciklumhomework.DateTime;

import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateTimeFormatting {

    static Logger log = Logger.getLogger(DateTimeFormatting.class.getName());

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, Month.NOVEMBER, 8);
        LocalTime time = LocalTime.of(11,22,33);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        log.info(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        log.info(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        log.info(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter longFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        log.info("Short formatting " + shortFormatter.format(dateTime));
        log.info("Medium formatting " + mediumFormatter.format(date));
        log.info("Long formatting " + longFormatter.format(date));
        log.info("Full formatting " + fullFormatter.format(date));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M dd, yyyy, hh:mm");
        log.info("Formating using pattern [M dd, yyyy, hh:mm]: " + dateTime.format(formatter));

        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        log.info("Formating using pattern [hh:mm]: " + sf.format(new Date()));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
        log.info("Formating using pattern [hh:mm]: " + dtf.format(time));
    }
}
