package ���Դ���;

import java.util.Calendar;

public class test63 {
	public static void main(String[] args){
		int year=2000;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		//c.set(Calendar.DATE, 1);
	   for(int month=Calendar.JANUARY;month<=Calendar.DECEMBER;month++)
	   {
		   c.set(Calendar.MONTH, month);
		   System.out.println(year+"��"+(month+1)+"��:"+c.getActualMaximum(Calendar.DATE));
	   }
	}

}
