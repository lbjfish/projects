package API_day03;

import java.util.Date;

/**
 * java.util.Date
 * ���ڲ�ά��һ��longֵ
 * �����1970��Ԫ������һ�̵ĺ���ֵ
 * @author soft01
 *
 */
public class DateDemo {
   public static void main(String [] args){
	   Date date = new Date();
	   //2014-08-21 10:33:22
	   System.out.println(date); //Date���Ѿ���д��toString ���
	                                      //������equals��д�����صĲ��ǵ�ַ
	                                      //�ˣ�����ֵ
	   long time = date.getTime();
	   time+=1000*60*60*24;  //����һ��ĺ�����
	   System.out.println(time);
	   date.setTime(time);
	   System.out.println(date);
   }
}
