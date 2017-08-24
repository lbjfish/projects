package ²âÊÔ´úÂë;

import java.util.Calendar;

public class test5 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2014);
		c.set(Calendar.MONTH,Calendar.JUNE);
		c.set(Calendar.DATE, 22);
		System.out.println(c.getTime());
		int a = c.get(Calendar.DATE);
		System.out.println(a);
	}

}
