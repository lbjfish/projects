package API_day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat
 * 可以根据一个特定的日期格式字符串
 * 将字符串与Date之间相互转换
 * @author soft01
 *
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args){
		Date now = new Date();
		System.out.println(now);
		//2014-08-21 11:07:22
		//yyyy-MM-dd HH:mm:ss
		String format = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String str = sdf.format(now);
		System.out.println(str);
	}

}
