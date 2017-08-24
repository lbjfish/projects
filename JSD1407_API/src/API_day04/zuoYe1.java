package API_day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class zuoYe1 {
	public static void main(String[] args) throws ParseException{
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入生产日期（yyyy-MM-dd）");
		String str = scan.next();
		String zq = "^\\d{4}(-\\d{2}){2}$";
		if(str.matches(zq))
		{
			System.out.println("请输入保质期（天数）");
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
			System.out.println("促销日期为："+str2);
		}
		else
		{
			System.out.println("输入错误");
		}
	}
}