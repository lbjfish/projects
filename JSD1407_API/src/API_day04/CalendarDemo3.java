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
		 * DAY_OF_HONYH ͨ��˵�ĺ�
		 * DAY_OF_YEAR  ���еĵڼ���
		 * DAY_OF_WEEK  ͨ��˵�����ڼ�
		 */
		c.set(Calendar.DATE, 8);
		c.set(Calendar.HOUR, 15);
		c.set(Calendar.MINUTE, 45);
		c.set(Calendar.SECOND, 55);
		System.out.println(c.getTime());
	}

}
