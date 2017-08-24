package ²âÊÔ´úÂë;

import java.util.Calendar;

public class test7 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2011);
		
		System.out.println(c.getActualMaximum(Calendar.DATE));
	}

}
