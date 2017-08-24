package API_day03;

import java.util.Date;

/**
 * java.util.Date
 * 其内部维护一个long值
 * 保存从1970年元旦到这一刻的毫秒值
 * @author soft01
 *
 */
public class DateDemo {
   public static void main(String [] args){
	   Date date = new Date();
	   //2014-08-21 10:33:22
	   System.out.println(date); //Date类已经重写了toString 因此
	                                      //不用像equals重写，返回的不是地址
	                                      //了，而是值
	   long time = date.getTime();
	   time+=1000*60*60*24;  //增加一天的毫秒数
	   System.out.println(time);
	   date.setTime(time);
	   System.out.println(date);
   }
}
