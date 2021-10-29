package ua.aleksandr.ciklumhomework.DateTime;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class UsingDateAndTime {
    
    static Logger log = Logger.getLogger(UsingDateAndTime.class.getName());
    
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, Month.NOVEMBER, 8);
        log.info(date);
        date = date.plusDays(12);
        log.info("Adding 12 days to prev date: " + date);

        LocalTime time = LocalTime.of(10,30);
        log.info(time);
        time = time.plusHours(4).plusMinutes(20);
        log.info("Adding 4 hours 20 minutes to prev time: " + time);

        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        log.info(localDateTime);
        localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
        log.info("Taking 10 hours, adding 2 days and 1 week to prev date: " + localDateTime);


        // before java 8
        Date myDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.set(Calendar.DATE, 20);
        calendar.set(Calendar.MONTH, 8);
        myDate = calendar.getTime();
        log.info(myDate);

        // exam tricks
        LocalDate ld = LocalDate.of(2010, Month.APRIL, 1);
        ld.plusDays(10); // return result is ignored
        log.info(ld);

        LocalTime lt = LocalTime.of(12,45);
        //lt.addDays(3); doesn't compile
    }
}
