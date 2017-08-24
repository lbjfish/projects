package API_day04;

import java.util.Calendar;

/**
 * Calendar的get方法
 * 可以获取当前Calendar所表示的时间中的某一个时间单位的值
 * @author soft01
 *
 */
public class CalendarDemo5 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//获取是哪一年
		int year = c.get(Calendar.YEAR);
		//获取哪月
		int month = c.get(Calendar.MONTH);
		//获取哪天
		int day = c.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);
		//获取星期几
		int dayofweek= c.get(Calendar.DAY_OF_WEEK);
		System.out.println("周"+(dayofweek==1?7:dayofweek-1)); 
	}

}
