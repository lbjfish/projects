package API_2day_04;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Demo16 {
	public static void main(String[] args) {
		Object oo = new Object();
		//Thread th1 = new Thread(new ThreadDe1(oo),"A");
		//Thread th2 = new Thread(new ThreadDe1(oo),"B");
		ExecutorService ex = Executors.newCachedThreadPool();
		ExecutorService ex2 =Executors.newFixedThreadPool(2);
		//for(int i=0;i<2;i++){
			//ex.execute(new ThreadDe1(oo));
		//}
		//ex.execute(new ThreadDe1(oo));
		//ex.execute(new ThreadDe2(oo));
		
		
		Future<Integer> fu = ex.submit(new ThreadDe3(0));
		Future<Integer> fu2 = ex.submit(new ThreadDe4(0));
		try {
			int ss = fu.get();
			int ss2 = fu2.get();
			
			System.out.println(ss);
			System.out.println(ss2);
			System.out.println(ss+ss2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ex.shutdown();
	}

}

class ThreadDe1 implements Runnable {
	private Object obj = new Object();
	
	public ThreadDe1(Object obj){
		this.obj = obj;
	}
	public   void trr(){
		System.out.println("wwwwwwwwwwww"+Thread.currentThread().getName());
		synchronized (this) {
			for(int i=1;i<=5;i++){
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

class ThreadDe2 implements Runnable {
	private Object obj = new Object();
	
	public ThreadDe2(Object obj){
		this.obj = obj;
	}
	public  void trr2(){
		System.out.println("wwwwwwwwwwww"+Thread.currentThread().getName());
		synchronized (this) {
			for(int i=101;i<=105;i++){
				System.out.println(i+"___"+Thread.currentThread().getName());
			}
		}
		System.out.println("--------"+Thread.currentThread().getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		trr2();
	}
	
}

class ThreadDe3 implements Callable<Integer> {
	private volatile int count = 0;
	
	public ThreadDe3(int count){
		this.count = count;
	}
	
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++){
			count = count + i;
			System.out.println(i+"___"+Thread.currentThread().getName());
		}
		return count;
	}
	
}
class ThreadDe4 implements Callable<Integer> {
	private volatile int count = 0;
	
	public ThreadDe4(int count){
		this.count = count;
	}
	
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		for(int i=101;i<=105;i++){
			count = count + i;
			System.out.println(i+"___"+Thread.currentThread().getName());
		}
		return count;
	}
	
}
