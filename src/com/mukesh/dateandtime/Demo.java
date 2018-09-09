package com.mukesh.dateandtime;

import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		//static method System.currentTimeMillis()
		long first=System.currentTimeMillis();
		int fact=1;
		int Mod=Integer.MAX_VALUE;
		for(int i=1;i<=10;i++) {
			fact=fact*i;
		}
		long last=System.currentTimeMillis();
		System.out.println("factorial : "+fact);
		System.out.println("time taken to calculate factorial is : "+(last-first) );
		//java.util.Date
		Date date=new Date();
		long time=date.getTime();
		System.out.println("time in miliseconds : "+time);
		Date date1=new Date(time);
		System.out.println("current date is : "+date1);
		//comparing dates
		//Date class implements the java.lang.Comparable interface
		int comparison=date.compareTo(date1);
		System.out.println("comparison date result : "+comparison);
	}

}
