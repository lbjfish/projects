package API_2day_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �ڶ��ִ����̵߳ķ�ʽ
 * �����߳���Runnable
 * @author soft01
 *
 */
public class ThreadDemo13 {
	public static void main(String[] args){
		
		MyRunnable3 my1 = new MyRunnable3();
		MyRunnable3 my2 = new MyRunnable3();
		
		Thread t1 = new Thread(my1,"���");
		Thread t2 = new Thread(my2,"ũ�������");
		
		t1.start();
		t2.start();
		
		//��̨�߳�����
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
				System.out.println(Thread.currentThread().getName()+"�����Է�["+i+"]");
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"������ս����");
	}
	
}

