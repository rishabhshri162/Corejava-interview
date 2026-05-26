package javabasic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalDate cdate = LocalDate.of(2002, 06, 01);

		Period p = Period.between(cdate, date);
		
		System.out.println(p.getYears());
	}

}
