package API_2day_04;

import java.util.concurrent.locks.ReentrantLock;

class MyThread5 implements Runnable {
	private static int ticketsCont = 5;
	public void showpiao(){
		while (ticketsCont > 0) {
			int a = ticketsCont--;
			System.out.println(Thread.currentThread().getName()+ "卖了一张票，剩余票数为:" + a);
		}
	}
	
	@Override
	public void run() {
		showpiao();
	}

}

public class ThreadDemo15_2 {
	public static void main(String[] args) {
		MyThread5 my = new MyThread5();
		
		for(int i=0;i<10;i++){
			new Thread(my).start();
		}
	}
}
