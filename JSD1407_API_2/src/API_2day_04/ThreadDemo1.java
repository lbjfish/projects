package API_2day_04;
/**
 * 第一种创建线程的方式
 *继承Thread类，重写run方法
 * @author soft01
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args){
	   Thread t1 = new MyThread1();
	   Thread t2 = new MyThread2();
		/**
		 * start方法用于将线程纳入线程调度
		 * 这时，线程进于runnable（等待）状态，等待
		 * 线程调度分配时间片段。
		 * 当线程调度将时间片分配给当前线程
		 * 该线程的run方法才开始被执行。
		 * 直到线程的run方法执行完毕，线程结束
		 * 最终被回收。
		 * 在线程的run方法执行期间，该线程处于走走停停。
		 */
	   
		t1.start();
		t2.start();	
		System.out.println("--------------");
		
	}
}
/**
 * 解耦 耦合 spring
 * @author soft01
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊");
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我查水表的");
		}
	}
}