package com.mukesh.dateandtime.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		int year       = calendar.get(Calendar.YEAR);
		System.out.println("Year : "+year);
		int month      = calendar.get(Calendar.MONTH); 
		System.out.println("Month : "+month);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
		System.out.println("Day of month : "+dayOfMonth);
		int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of week : "+dayOfWeek);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Week of year : "+weekOfYear);
		int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);
		System.out.println("week of month : "+weekOfMonth);
		int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
		System.out.println("current hour : "+hour);
		int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
		System.out.println("hour of day : "+hourOfDay);
		int minute     = calendar.get(Calendar.MINUTE);
		System.out.println("current minute : "+minute);
		int second     = calendar.get(Calendar.SECOND);
		System.out.println("current second : "+second);
		int millisecond= calendar.get(Calendar.MILLISECOND);
		System.out.println("current millisecond : "+millisecond);
		//Adding and Subtracting to Year,Month,day etc
		Calendar calendar1 = new GregorianCalendar();

		//set date to last day of 2009
		calendar1.set(Calendar.YEAR, 2009);
		calendar1.set(Calendar.MONTH, 11); // 11 = december
		calendar1.set(Calendar.DAY_OF_MONTH, 31); // new years eve

		//add one day
		calendar1.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Arithmetic Calculation");
		//date is now jan. 1st 2010
		int year1       = calendar1.get(Calendar.YEAR);  // now 2010
		System.out.println("year : "+year1);
		int month1      = calendar1.get(Calendar.MONTH); // now 0 (Jan = 0)
		System.out.println("Month : "+month1);
		int dayOfMonth1 = calendar1.get(Calendar.DAY_OF_MONTH); // now 1
		System.out.println("day of month : "+dayOfMonth1);
		/*
		 * The Month Trap
			The MONTH field of the Calendar class does not go from 1 to 12 like they do 
			when we write dates otherwise. Instead the months run from 0 to 11, where 0 
			is January and 11 is December. This can cause a bit of errors and subsequent 
			debugging if you are not aware of this.
		 * The Day of Week Trap
			The day of week runs from 1 to 7 as you might expect, but sunday, not monday is the first day of the week. 
			That means that 1 = sunday, 2 = monday, ..., 7 = saturday. This has also caused me minor 
			annoyances from time to time.
		 */
	}

}
