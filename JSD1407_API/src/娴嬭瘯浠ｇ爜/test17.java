package ���Դ���;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test17 {
	public static void main(String[] args) throws ParseException{
		Scanner scan = new Scanner(System.in);
		System.out.println("�������������ڣ�yyyy-MM-dd��");
		String str = scan.next();
		System.out.println("�����뱣���ڣ�������");
		int str1 = scan.nextInt();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(str);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_YEAR, str1);
		//System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_YEAR, -14);
		//System.out.println(c.getTime());
		c.set(Calendar.DAY_OF_WEEK,4);
		//System.out.println(c.getTime());
		Date date1 = c.getTime();
		String str2 = sdf.format(date1);
		System.out.println(str2);
		
	}

}
