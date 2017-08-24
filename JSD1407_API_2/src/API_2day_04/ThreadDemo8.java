package API_2day_04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * sleep阻塞 
 * 制作电子表
 * @author soft01
 *
 */
public class ThreadDemo8 {
	public static void main(String[] args){
		/*
		 * 实现电子表
		 * 
		 * 15：51：33
		 */
		

		
		while(true){
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Date now = new Date();
			System.out.println(sdf.format(now));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
