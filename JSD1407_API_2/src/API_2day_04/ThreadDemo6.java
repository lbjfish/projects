package API_2day_04;
/**
 * �߳����ȼ�
 * 1-10
 * �����ϣ��߳����ȼ��ߵ��̣߳�������ʱ��Ƭ�εĴ�����
 * @author soft01
 *
 */
public class ThreadDemo6 {
	public static void main(String[] args){
		Thread min = new Thread(){
			public void run(){
				Thread ttt = Thread.currentThread();
				System.out.println("min:"+ttt.getId()+":"+ttt.getName()+":"+ttt.getPriority());
				for(int i=0;i<5000;i++){
					System.out.println("min");
				}
			}
		};
		
		Thread max = new Thread(){
			public void run(){
				Thread ttt = Thread.currentThread();
				System.out.println("max:"+ttt.getId()+":"+ttt.getName()+":"+ttt.getPriority());
				for(int i=0;i<5000;i++){
					System.out.println("max");
				}
			}
		};
		
		Thread nomal = new Thread(){
			public void run(){
				Thread ttt = Thread.currentThread();
				System.out.println("nomal:"+ttt.getId()+":"+ttt.getName()+":"+ttt.getPriority());
				for(int i=0;i<5000;i++){
					System.out.println("nomal");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		nomal.setPriority(Thread.NORM_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		
		max.start();
		nomal.start();
		min.start();
	}

}
