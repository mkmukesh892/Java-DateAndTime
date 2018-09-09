package com.mukesh.dateandtime.instant;

import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		Instant now=Instant.now();
		System.out.println("Instant date : "+now);
		System.out.println("Instant epoch second : "+now.getEpochSecond());
		System.out.println("Instant nano seconds : "+now.getNano());
		/*
		 *Instant Calculations
			The Instant class also has several methods which can be used to make calculations 
			relative to an Instant. Some (not all) of these methods are:

			plusSeconds()
			plusMillis()
			plusNanos()
			minusSeconds()
			minusMillis()
			minusNanos() 
		 * 
		 */
	}

}
