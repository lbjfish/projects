package ���Դ���;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Ŀ���ǽ�Ӣ������ת��Ϊ�ַ���ʽ��ʽ���
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
