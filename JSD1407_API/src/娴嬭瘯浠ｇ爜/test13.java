package ���Դ���;

import java.util.Calendar;

/**
 * ����һ���ȥ�����µ�ʱ��
 * @author soft01
 *
 */
public class test13 {
	public static void testAdd(){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.MONTH, -3);
		c.add(Calendar.DATE, 1);
		System.out.println(c.getTime());
		System.out.println("year:"+c.get(Calendar.YEAR));
		System.out.println("month:"+c.get(Calendar.MONTH));
		System.out.println("date:"+c.get(Calendar.DATE));
	}
	public static void main(String[] args){
		testAdd();
	}

}
