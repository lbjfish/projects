package API_day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ��дһ������
 * �û������Լ������գ���ʽ��yyyy-MM-dd
 * Ȼ����ʾ�û�������λ���Ѿ����˶�����
 * @author soft01
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException{
		/**
		 * 1.�û�����һ�����յ��ַ���
		 * 2.���ַ���ת��ΪDate
		 * 3������һ��Date��ʾ�����ʱ��
		 * 4.����ĺ����ȥ���յĺ���
		 *   ��������˶����
		 * 5.������ת��Ϊ��
		 * 6.���
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("������������գ�");
		String sr = scan.next();
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
	   Date date1 = sdf.parse(sr);
	   long time1 = date1.getTime();
	   Date date2 = new Date();
		long time2 = date2.getTime();
		long hm = time2-time1;
	   System.out.println("�����"+hm+"����!");
	   long tian1 = time1/1000/60/60/24;
	   long tian2 = time2/1000/60/60/24;
	   long tian = tian2-tian1;
	   System.out.println("�����"+tian+"�죡");
	   
	}

}
