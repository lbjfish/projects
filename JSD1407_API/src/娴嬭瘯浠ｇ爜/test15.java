package ²âÊÔ´úÂë;

import java.util.Calendar;
import java.util.Date;

public class test15 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//c.getTime();
		Date date = new Date();
      c.setTime(date);
      date = c.getTime();
      System.out.println(date);
	}

}
