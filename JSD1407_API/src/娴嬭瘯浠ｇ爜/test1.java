package ���Դ���;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ŀ���ǽ��ַ���ת����Date��
 * @author soft01
 *
 */
public class test1 {
	public static void main(String[] args) throws ParseException{
		String str = "2008��7��27��";
		String format = "yyyy��MM��dd��";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(str);
		System.out.print(date);
	}

}
