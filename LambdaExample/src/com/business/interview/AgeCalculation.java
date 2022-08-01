package com.business.interview;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate start = LocalDate.of(1988, 6, 21);
		LocalDate end = LocalDate.of(2022, 7, 15); // use for age-calculation: LocalDate.now()
		long years = ChronoUnit.YEARS.between(start, end);
		System.out.println(years); // 17

	}

}
