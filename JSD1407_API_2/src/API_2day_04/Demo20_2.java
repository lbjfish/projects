package API_2day_04;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Condition�ܸ��õĿ���֪ͨ�ߣ�Condition����ȷ֪ͨ��˭����wait������notify��������֪��֪ͨ��˭�ˣ�
 * ֻ���ĸ��̻߳��ʱ��Ƭ�ˣ�֪ͨ��wait������notify������һ�λ�������wait��������ʵҲ�ǲ�֪�����ѵ�
 * ��˭��Condition�Ϳ��ԣ� �����new Condition������������������ȷ����֪ͨ˭
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
				System.out.println("Ҫ��������:"+sc+","+"�������"+list.size()+",�����ֿ�������������!!!");
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
			System.out.println("��������������"+sc+",�ֿ�����"+list.size()+"����������.");
			ConsumerLock.signal();
		}finally{
			lock.unlock();
		}
	}
	
	public void consum(int xf){
		try{
			lock.lock(); 
			while (xf > list.size()) {
				System.out.println("Ҫ��������:"+xf+","+"�������"+list.size()+",��������С�ڿ������������!!!");
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
			System.out.println("�����ѵ�������"+xf+",�ֿ�����"+list.size()+"����������.");
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