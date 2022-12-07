package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
//        Date Class
        Date date=new Date();
        System.out.println("Current date is:"+date);
   Date date2=new Date(2023,11,2);
        System.out.println(date2.after(date));
        System.out.println(date.after(date2));
        System.out.println(date2.before(date));
        System.out.println(date.before(date2));
        System.out.println("get time in milliseconds:"+date.getTime());

//        LocalDate Class
//        creates a date object
    LocalDate date3=LocalDate.now();
        System.out.println("Current date:"+date3);
        LocalTime time=LocalTime.now();
        System.out.println("Time :"+time);

//        display current date and time
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = dateTime.format(dateTimeFormatter);
        System.out.println("After formatting: " + formattedDate);

//Calendar class
        Calendar date5=Calendar.getInstance();
        System.out.println("Recent date and time is:"+date5.getTime());

        System.out.println("Month is:"+date5.get(Calendar.MONTH));

    }
}
