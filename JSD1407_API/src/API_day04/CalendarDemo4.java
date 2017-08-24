package API_day04;

import java.util.Calendar;

public class CalendarDemo4 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//1表示周日，2表示周一
		c.set(Calendar.DAY_OF_WEEK, 2);
		System.out.println(c.getTime());
	}

}
