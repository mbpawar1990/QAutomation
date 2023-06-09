package Utilities;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {

	public static void main(String[] args) throws ParseException {
	//	System.out.println(getRequiredDateBasedOnNumberOfDays("dd MM yyyy HH:mm:ss", -3));
//	System.out.println(getRequiredDateBasedOnNumberOfDays("dd MM yyyy", -3));
		//System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMM yyyy", 3));
		//System.out.println(getRequiredDateBasedOnNumberOfDays("dd MMMM yyyy", 3));
	//	System.out.println(getRequiredDateBasedOnNumberOfMonths("dd/MMM/yyyy", 4));
	//	System.out.println(getRequiredDateBasedOnNumberOfYears("dd MMMM yyyy", -5));
	
		compareDate("dd MM yyyy", "28 12 2022", "27 12 2022");
	}
	public static String getRequiredDateBasedOnNumberOfDays(String format, int numberOfDays) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, numberOfDays);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnNumberOfMonths(String format, int numberOfMonths) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, numberOfMonths);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	public static String getRequiredDateBasedOnNumberOfYears(String format, int numberOfYears) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, numberOfYears);
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(new Date(cal.getTimeInMillis()));
	}
	
	public static void compareDate(String dateFormat,String d1,String d2) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);  
		//dates to be compare, convert the given String to Date class object
		Date date1 = (Date) sdf.parse(d1);  
		Date date2 = (Date) sdf.parse(d2);  
		//prints dates  
		System.out.println("Date 1: " + sdf.format(date1));  
		System.out.println("Date 2: " + sdf.format(date2));  
		//comparing dates  
		if(date1.compareTo(date2) > 0)   
		{  
			System.out.println("Date 1 comes after Date 2");  
		}   
		else if(date1.compareTo(date2) < 0)   
		{  
			System.out.println("Date 1 comes before Date 2");  
		}   
		else if(date1.compareTo(date2) == 0)   
		{  
			System.out.println("Both dates are equal");  
		}    
	}
	}


