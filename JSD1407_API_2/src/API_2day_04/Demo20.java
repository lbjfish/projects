package API_2day_04;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo20 {
	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		CangKu ck = new CangKu();
		Producer pro = new Producer(list, ck.getMaxCk());
		Comsumer com = new Comsumer(list);

		ExecutorService ex = Executors.newFixedThreadPool(6);
		ex.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				pro.shengchan(5);
			}
		});

		ex.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				com.xiaofei(3);
			}
		});
		ex.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				com.xiaofei(3);
			}
		});
		ex.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				pro.shengchan(10);
			}
		});
		ex.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				com.xiaofei(4);
			}
		});
	}
}

class CangKu {
	private LinkedList<Object> list = new LinkedList<Object>();

	private static final int MAX_CK = 100;

	public List<Object> getList() {
		return list;
	}

	public void addList(Object obj) {
		list.add(obj);
	}

	public static int getMaxCk() {
		return MAX_CK;
	}

}

class Producer {
	private LinkedList<Object> list;
	private int max_ck;

	public Producer(LinkedList<Object> list, int max_ck) {
		this.list = list;
		this.max_ck = max_ck;
	}

	public void shengchan(int xf) {
		synchronized (list) {
			while (list.size() + xf > max_ck) {
				System.out.println("要生产数量:"+xf+","+"库存量："+list.size()+",超过仓库容量不能生产!!!");
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int i = 0; i < xf; i++) {
				list.add(new Object());
			}
			System.out.println("已生产的数量："+xf+",仓库量："+list.size()+"，可以生产.");
			list.notifyAll();
		}
	}

}

class Comsumer {
	private LinkedList<Object> list;

	public Comsumer(LinkedList<Object> list) {
		this.list = list;
	}

	public void xiaofei(int xf) {
		synchronized (list) {
			while (xf > list.size()) {
				System.out.println("要消费数量:"+xf+","+"库存量："+list.size()+",消费数量小于库存量不能消费!!!");
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			for (int i = 0; i < xf; i++) {
				list.pop();
			}
			System.out.println("已消费的数量："+xf+",仓库量："+list.size()+"，可以消费.");
			list.notifyAll();
		}
	}
}