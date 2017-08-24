package 测试代码;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目的是将字符串转换成Date型
 * @author soft01
 *
 */
public class test1 {
	public static void main(String[] args) throws ParseException{
		String str = "2008年7月27日";
		String format = "yyyy年MM月dd日";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(str);
		System.out.print(date);
	}

}
