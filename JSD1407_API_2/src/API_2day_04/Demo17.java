package API_2day_04;

import com.sun.swing.internal.plaf.synth.resources.synth;

public class Demo17 {
	public static void main(String[] args) {
		Object obj = new Object();
		Thread t1 = new Thread(new Demo1(obj),"A");
		Thread t2 = new Thread(new Demo2(obj),"B");
		Thread t3 = new Thread(new Demo3(obj),"C");
		t1.start();
		t2.start();
		t3.start();
	}
}

class Demo1 implements Runnable {
	private Object obj = new Object();
	public Demo1(Object obj){
		this.obj = obj;
	}
	public Demo1(){
		
	}
	
	public void jia(){
		synchronized (obj) {
			System.out.println("demo1......."+Thread.currentThread().getName());
			try {
				
				obj.wait();
				
				System.out.println("demo111111"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		jia();
	}
	
}

class Demo2 implements Runnable {
	
	private Object obj = new Object();
	
	public Demo2(){
		
	}
	public Demo2(Object obj){
		this.obj = obj;
	}
	public void jian(){
		synchronized (obj) {
			System.out.println("demo2......"+Thread.currentThread().getName());
			obj.notifyAll();
			
			System.out.println("demo222222"+Thread.currentThread().getName());
			
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		jian();
	}
	
}

class Demo3 implements Runnable {
	
	private Object obj = new Object();
	
	public Demo3(){
		
	}
	public Demo3(Object obj){
		this.obj = obj;
	}
	public void jian(){
		synchronized (obj) {
			System.out.println("demo3......"+Thread.currentThread().getName());
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("demo33333333"+Thread.currentThread().getName());
			
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		jian();
	}
	
}