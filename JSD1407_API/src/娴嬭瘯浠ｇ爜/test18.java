package ²âÊÔ´úÂë;

import java.util.Calendar;
import java.util.Date;

public class test18 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//c.set(Calendar.YEAR, 2014);
		//c.set(Calendar.MONTH, 10);
		c.set(Calendar.SATURDAY,2);
		//int dayofweek = c.get(Calendar.WEDNESDAY);
		System.out.print(c.getTime()); 
	}

}
