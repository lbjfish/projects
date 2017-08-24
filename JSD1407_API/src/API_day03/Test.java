package API_day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 编写一个程序
 * 用户输入自己的生日，格式：yyyy-MM-dd
 * 然后提示用户到今天位置已经活了多少天
 * @author soft01
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException{
		/**
		 * 1.用户输入一个生日的字符串
		 * 2.将字符串转换为Date
		 * 3。创建一个Date表示今天的时间
		 * 4.今天的毫秒减去生日的毫秒
		 *   计算出活了多毫秒
		 * 5.将毫秒转换为天
		 * 6.输出
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入你的生日：");
		String sr = scan.next();
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
	   Date date1 = sdf.parse(sr);
	   long time1 = date1.getTime();
	   Date date2 = new Date();
		long time2 = date2.getTime();
		long hm = time2-time1;
	   System.out.println("你活了"+hm+"毫秒!");
	   long tian1 = time1/1000/60/60/24;
	   long tian2 = time2/1000/60/60/24;
	   long tian = tian2-tian1;
	   System.out.println("你活了"+tian+"天！");
	   
	}

}
