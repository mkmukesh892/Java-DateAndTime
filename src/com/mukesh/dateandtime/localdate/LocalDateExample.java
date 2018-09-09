package com.mukesh.dateandtime.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateExample {

	public static void main(String[] args) {
		//local date
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		LocalDate localDate2=LocalDate.of(1992, 07, 12);
		System.out.println(localDate2);
		int year=localDate2.getYear();
		System.out.println("year : "+year);
		Month month=localDate2.getMonth();
		System.out.println("Month : "+month.getValue());
		int dayOfMonth=localDate2.getDayOfMonth();
		System.out.println("Day of month : "+dayOfMonth);
		int dayOfYear=localDate2.getDayOfYear();
		System.out.println("Day of year : "+dayOfYear);
		DayOfWeek dayOfWeek=localDate2.getDayOfWeek();
		System.out.println("Day of week : "+dayOfWeek);
		//local time
		LocalTime localTime=LocalTime.now();
		System.out.println("Local time : "+localTime);
	}

}
