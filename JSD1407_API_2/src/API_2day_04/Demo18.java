package API_2day_04;

public class Demo18 {
	private int count = 0;
	private Object obj = new Object();
	
	public static void main(String[] args) {
		Demo18 d = new Demo18();
		d.abc();
	}
	
	public void abc(){
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (obj) {
					System.out.println("开始算值....");
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("最后算出来的值:"+count);
				}
			}
		});	
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (obj) {
					for(int i=0;i<101;i++){
						count += i;
					}
					obj.notify();
					System.out.println("算出来了。。。");
				}
				
			}
		});	
		t1.start();
		t2.start();
	}
}
