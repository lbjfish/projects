package API_2day_04;

public class SyncDemo2 {
	public static void main(String[] args){
		final SyncDemo2 demo = new SyncDemo2();
		Thread t1 = new Thread(){
			public void run(){
			  demo.buy(getName());
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				demo.buy(getName());
			}
		};
		t1.start();
		t2.start();
	}
	
	public void buy(String name){
		System.out.println(name+"�������·�");
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(name+"�����·���");
	synchronized(this){
		System.out.println(name+"׼�����·�");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+"�����·���");
		System.out.println(name+"����.");
	}
	
  }

}
