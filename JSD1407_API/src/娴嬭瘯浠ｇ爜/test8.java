package ²âÊÔ´úÂë;

import java.util.Calendar;

public class test8 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.MONTH, -3);
		//c.add(Calendar.DATE, 3);
		System.out.println("year:"+c.get(Calendar.YEAR));
		System.out.println("month:"+(c.get(Calendar.MONTH)+1));
		System.out.println("day:"+c.get(Calendar.DAY_OF_WEEK));
	}

}
