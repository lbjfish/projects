package 测试代码;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 目的是将英文日期转换为字符串式中式输出
 * @author soft01
 *
 */
public class test2 {
	public static void main(String[] args){
		Date date = new Date();
		String format1 = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format1);
		String str = sdf.format(date);
		System.out.println(str);
	}

}
