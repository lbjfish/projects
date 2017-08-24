package ²âÊÔ´úÂë;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class test3 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		System.out.println(c.getClass().getName());
		System.out.println(c.getTime());
		GregorianCalendar c1 = new GregorianCalendar(2013,Calendar.DECEMBER,25);
		System.out.println(c1.getTime());
	}

}
