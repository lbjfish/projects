package API_day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���ַ���ת��ΪDate
 * @author soft01
 *
 */
public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException{
		String str = "2008��8��21�� 23��44��21";
		String format = "yyyy��MM��dd�� HH��mm��ss";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(str); 
		System.out.println(date);
	}

}
