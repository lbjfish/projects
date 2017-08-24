package ²âÊÔ´úÂë;

import java.util.Calendar;

public class test4 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2014);
		c.set(Calendar.MONTH, Calendar.JUNE);
		c.set(Calendar.DATE,25);
		System.out.println(c.getTime());
		c.set(Calendar.DATE, 32);
		System.out.println(c.getTime());
	}

}
