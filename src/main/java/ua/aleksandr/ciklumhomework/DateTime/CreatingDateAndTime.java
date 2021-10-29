package ua.aleksandr.ciklumhomework.DateTime;

import org.apache.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CreatingDateAndTime {
    static Logger log = Logger.getLogger(CreatingDateAndTime.class.getName());

    public static void main(String[] args) {
        log.info(LocalDate.now());
        log.info(LocalTime.now());
        log.info(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(2021, Month.NOVEMBER, 8);
        LocalTime localTime = LocalTime.of(16, 0);

        log.info(localDate);
        log.info(localTime);
        log.info(LocalDateTime.of(localDate, localTime));

        // before java 8
        log.info(new Date());

        Calendar calendar = Calendar.getInstance();
        calendar.set(2021, Calendar.NOVEMBER, 20);
        Date january = calendar.getTime();
        log.info(january);
    }
}
