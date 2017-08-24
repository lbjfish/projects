package API_2day_04;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition能更好的控制通知者，Condition能明确通知给谁，而wait（），notify（）不能知道通知到谁了，
 * 只是哪个线程获得时间片了，通知给wait（），notify（）是一次唤醒所有wait（），其实也是不知道唤醒的
 * 是谁，Condition就可以， 你可以new Condition（）两个，它就能明确告诉通知谁
 * @author Administrator
 *
 */
public class Demo20_2 {
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(2);
		ex.execute(new Producer2(3));
		ex.execute(new Consumer2(2));
		ex.execute(new Consumer2(2));
		ex.execute(new Producer2(1));
		ex.shutdown();
	}
}

class CangKu2 {
	private static LinkedList<Object> list = new LinkedList<Object>();

	private static final int MAX_CK = 100;
	
	private static ReentrantLock lock = new ReentrantLock();  
	private static Condition producerLock = lock.newCondition();  
	private static Condition ConsumerLock = lock.newCondition();  
	
	public void produce(int sc){
		try{
			lock.lock(); 
			while (list.size() + sc > MAX_CK) {
				System.out.println("要生产数量:"+sc+","+"库存量："+list.size()+",超过仓库容量不能生产!!!");
				try {
					producerLock.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int i = 0; i < sc; i++) {
				list.add(new Object());
			}
			System.out.println("已生产的数量："+sc+",仓库量："+list.size()+"，可以生产.");
			ConsumerLock.signal();
		}finally{
			lock.unlock();
		}
	}
	
	public void consum(int xf){
		try{
			lock.lock(); 
			while (xf > list.size()) {
				System.out.println("要消费数量:"+xf+","+"库存量："+list.size()+",消费数量小于库存量不能消费!!!");
				try {
					ConsumerLock.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int i = 0; i < xf; i++) {
				list.pop();
			}
			System.out.println("已消费的数量："+xf+",仓库量："+list.size()+"，可以消费.");
			producerLock.signal();
		}finally{
			lock.unlock();
		}
	}
}

class Producer2 implements Runnable {
	int sc;
	Producer2(int sc){
		this.sc = sc;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		CangKu2 ck = new CangKu2();
		ck.produce(sc);
	}
	
}

class Consumer2 implements Runnable {
	int xf;
	Consumer2(int xf){
		this.xf = xf;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		CangKu2 ck = new CangKu2();
		ck.consum(xf);
	}
	
}