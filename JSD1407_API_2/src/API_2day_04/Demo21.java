package API_2day_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo21 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new MyThread22(),"A");
		Thread th2 = new Thread(new MyThread22(),"B");
		th1.start();
		try {
			th1.join();
			System.out.println("main");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
		
	}
}

class MyThread22 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
