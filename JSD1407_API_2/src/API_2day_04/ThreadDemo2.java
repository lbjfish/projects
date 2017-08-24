package API_2day_04;
/**
 * 第二种创建线程的方式
 * 定义线程体Runnable
 * @author soft01
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args){
//		Runnable run1 = new MyRunnable1();
//		Runnable run2 = new MyRunnable2();
//		
//		Thread t1 = new Thread(run1);
//		Thread t2 = new Thread(run2);
//		
//		t1.start();
//		t2.start();
		
		MyRunnable1 my1 = new MyRunnable1();
		MyRunnable1 my2 = new MyRunnable1();
		
		
	}

}

class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			System.out.println("你谁啊");
		}
	}
	
}

class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			System.out.println("我修水管的");
		}
	}
	
}