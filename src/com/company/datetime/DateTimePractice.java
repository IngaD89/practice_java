package com.company.datetime;

import java.time.*;

public class DateTimePractice {
    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

        System.out.println(zonedDateTime);
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(instant);


//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDate localDate1 = LocalDate.now(ZoneId.of("Asia/Aden"));
        System.out.println(localDate1);
    }
}
