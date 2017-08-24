package 测试代码;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class test12 {
	public static void testGetActualMaximum(){
		Calendar c = Calendar.getInstance();
		int year=2013;
		c.set(Calendar.YEAR, year);
		//c.set(Calendar.DATE, 1);
		for(int month=Calendar.JANUARY;month<=Calendar.DECEMBER;month++)
		{
			c.set(Calendar.MONTH, month);
			System.out.println(year+"年"+(month+1)+"月:"+c.getActualMaximum(Calendar.DATE)+"天");
		}
	}
	public static void main(String[] args){	 
		testGetActualMaximum();
	}

}
