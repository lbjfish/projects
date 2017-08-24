package API_2day_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ��count !=0 ʱ�����ϵ�����ֵ���� count==0ʱ��������ǰ�Ǹ��̣߳�ֱ������ĳ����������
 * �ٽ���ȴ�״̬������ûд�����ǿ������ţ���ĳ��������count�ֲ�����0ʱ�����ǾͲ���wait�ˣ�
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
								System.out.println("�������������");
								obj.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						int a = count--;
						System.out.println("���ѵ�ֵ��"+a+","+Thread.currentThread().getName());
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
