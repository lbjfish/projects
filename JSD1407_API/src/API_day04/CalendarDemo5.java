package API_day04;

import java.util.Calendar;

/**
 * Calendar��get����
 * ���Ի�ȡ��ǰCalendar����ʾ��ʱ���е�ĳһ��ʱ�䵥λ��ֵ
 * @author soft01
 *
 */
public class CalendarDemo5 {
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		//��ȡ����һ��
		int year = c.get(Calendar.YEAR);
		//��ȡ����
		int month = c.get(Calendar.MONTH);
		//��ȡ����
		int day = c.get(Calendar.DATE);
		System.out.println(year+"-"+month+"-"+day);
		//��ȡ���ڼ�
		int dayofweek= c.get(Calendar.DAY_OF_WEEK);
		System.out.println("��"+(dayofweek==1?7:dayofweek-1)); 
	}

}
