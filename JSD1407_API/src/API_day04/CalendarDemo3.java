package API_day04;

import java.util.Calendar;

public class CalendarDemo3 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		/**
		 * 2008-08-08
		 */
		c.set(Calendar.YEAR, 2014);
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		/**
		 * DAY_OF_HONYH 通常说的号
		 * DAY_OF_YEAR  年中的第几天
		 * DAY_OF_WEEK  通常说的星期几
		 */
		c.set(Calendar.DATE, 8);
		c.set(Calendar.HOUR, 15);
		c.set(Calendar.MINUTE, 45);
		c.set(Calendar.SECOND, 55);
		System.out.println(c.getTime());
	}

}
