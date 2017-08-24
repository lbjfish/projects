package API_2day_04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo16_2 {
	
	public static void main(String[] args) {
		Object obj = new Object();
		ExecutorService ex = Executors.newCachedThreadPool();
		ex.execute(new ThreadDe(obj));
		ex.execute(new ThreadDe(obj));
		ex.shutdown();
	}
}

class ThreadDe implements Runnable {
	private Object obj = new Object();
	
	public ThreadDe(){
		
	}
	public ThreadDe(Object obj){
		this.obj = obj;
	}
	public void trr(){
		System.out.println("wwwwwwwwwwww"+Thread.currentThread().getName());
		synchronized (obj) {
			for(int i=1;i<=50;i++){
				System.out.println(i+"___"+Thread.currentThread().getName());
			}
		}
		System.out.println("--------"+Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		trr();
	}
	
}