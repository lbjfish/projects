package ²âÊÔ´úÂë;

import java.util.Calendar;
import java.util.Date;

public class test9 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		c.setTime(date);
		date = c.getTime();
		System.out.print(date);
	}

}

