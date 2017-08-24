package API_2day_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 当count !=0 时，不断的消费值，当 count==0时，阻塞当前那个线程，直到满足某个条件让它
 * 再进入等待状态（这里没写，但是可以相信，当某个条件让count又不等于0时，这是就不在wait了）
 * @author Administrator
 *
 */
public class Demo19 {
	private static final int LOCAL_POOL= 13;
	private Object obj = new Object();
	private int count = 10;
	
	public void abc(){
		ExecutorService ex = Executors.newFixedThreadPool(LOCAL_POOL);
		for(int i=0;i<LOCAL_POOL;i++){
			ex.execute(new Runnable() {
				
				@Override
				public void run() {
					synchronized (obj) {
						while(count == 0){
							try {
								System.out.println("等于零就阻塞了");
								obj.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						int a = count--;
						System.out.println("消费的值："+a+","+Thread.currentThread().getName());
						obj.notifyAll();
						
					}
					
				}
			});
		}
		ex.shutdown();
	}
	
	public static void main(String[] args) {
		Demo19 d = new Demo19();
		d.abc();
	}

}
