package API_2day_04;

class MyThread extends Thread {
	private int ticketsCont = 5;
	private String name;
	
	public MyThread(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		while(ticketsCont>0){
			ticketsCont--;
			System.out.println(name+"����һ��Ʊ��ʣ��Ʊ��Ϊ:"+ticketsCont);
		}
	}
}

public class ThreadDemo15 {
	public static void main(String[] args) {
		MyThread my1 = new MyThread("����1");
		MyThread my2 = new MyThread("����2");
		MyThread my3 = new MyThread("����3");
		
		my1.start();
		my2.start();
		my3.start();
	}
}
