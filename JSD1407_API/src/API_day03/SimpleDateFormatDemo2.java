package API_day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将字符串转换为Date
 * @author soft01
 *
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException{
		String str = "2008年8月21日 23：44：21";
		String format = "yyyy年MM月dd日 HH：mm：ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(str); 
		System.out.println(date);
	}

}
