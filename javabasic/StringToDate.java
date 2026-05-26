package javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class StringToDate {

	public static void main(String[] args) throws ParseException {
		String s = "12-06-2025";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
		Date d = sdf.parse(s);
		
		System.out.println(s);
	}
	
	
}
