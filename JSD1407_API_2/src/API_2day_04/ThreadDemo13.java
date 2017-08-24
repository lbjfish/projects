package API_2day_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 第二种创建线程的方式
 * 定义线程体Runnable
 * @author soft01
 *
 */
public class ThreadDemo13 {
	public static void main(String[] args){
		
		MyRunnable3 my1 = new MyRunnable3();
		MyRunnable3 my2 = new MyRunnable3();
		
		Thread t1 = new Thread(my1,"隋军");
		Thread t2 = new Thread(my2,"农民起义军");
		
		t1.start();
		t2.start();
		
		//舞台线程休眠
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		my1.keepRunning = false;
		my2.keepRunning = false;
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}

class MyRunnable3 implements Runnable{
	
	volatile boolean keepRunning = true ;
	
	@Override
	public void run() {
		while(keepRunning){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"结束了战斗！");
	}
	
}

