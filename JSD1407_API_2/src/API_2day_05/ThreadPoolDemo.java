package API_2day_05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * ���������߳��Լ������߳�����
 * @author soft01
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args){
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		for(int i=0;i<3;i++){
			Thread runn = new Thread(){
				public void run(){
					for(int j=0;j<5;j++){
						System.out.println(j);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			};
			threadPool.execute(runn);
		}
	}

}
