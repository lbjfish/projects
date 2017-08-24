package API_day04;

import java.util.Calendar;

public class CalendarDemo6 {
	public static void main(String[] args){
		int year =2014;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		//c.set(Calendar.DATE,24);
		for(int month=Calendar.JANUARY;month<=Calendar.DECEMBER;month++)
		{
			c.set(Calendar.MONTH, month);
			System.out.println(year+"Äê"+(month+1)+"ÔÂ£º"+c.getActualMaximum(Calendar.DATE));
		}
	}

}
