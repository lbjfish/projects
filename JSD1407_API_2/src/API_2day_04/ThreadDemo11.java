package API_2day_04;

public class ThreadDemo11 {
	private static int total; 
	
	public static void main(String[] args) {
		Thread b = new Thread(){
			public void run(){
				synchronized (this) {
		            for (int i = 0; i < 101; i++) {
		                total += i; 
		            } 
		            System.out.println("计算完成");
		            //（完成计算了）唤醒在此对象监视器上等待的单个线程，在本例中线程A被唤醒
		            notify(); 
		            
		        } 
			}
		};
		Thread a = new Thread(){
			public void run(){
				//拿到的是b对象的锁，而不是b线程的锁,虽然名字一样 这边肯定要绕晕以后,但是懒得解释
				synchronized (b) {
		            System.out.println("等待对象b完成计算。。。");
		            //当前线程A等待
		            try {
						b.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            System.out.println("b对象计算的总和是：" + total);
		        } 
			}
		};
		
		a.start();
		b.start();
		
	}
}
