package API_2day_04;
/**
 * 线程其他API
 * @author soft01
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args){
		//获取调用main方法的线程的相关信息
		Thread t = Thread.currentThread();
		System.out.println("调用main方法的线程是："+t);
		
		//获取线程ID，通常由系统分配
		long id = t.getId();
		System.out.println("id:"+id);
		
		/**
		 * 获取线程名字，通常由系统指定
		 * 格式为：Thread-X
		 * 但调用mian方法的线程名字不是这个。
		 */
		
		String name = t.getName();
		System.out.println("name:"+name);
		
		//获取线程的优先级
		int p = t.getPriority();
		System.out.println("优先级："+p);
		
		//获取线程状态
		System.out.println("state:"+t.getStackTrace());
		
		//获取线程是否活着
		System.out.println("alive:"+t.isAlive());
		
		//获取线程是否为后台线程
		System.out.println("daemon:"+t.isDaemon());
		
		//获取线程是否中断
		System.out.println("interrupt:"+t.isInterrupted());
		
		Thread t2 = new Thread(){
			public void run(){
				Thread my = Thread.currentThread();
				System.out.println("自己创建的:"+my);
				long id2 = my.getId();
				System.out.println("自己的id:"+id2);
				
				System.out.println("Myname2:"+my.getName());
				System.out.println("Myname3:"+getName());
				
				//获取线程的优先级
				int p = my.getPriority();
				System.out.println("my优先级："+p);
				
				//获取线程状态
				System.out.println("mystate:"+my.getStackTrace());
				
				//获取线程是否活着
				System.out.println("myalive:"+my.isAlive());
				
				//获取线程是否为后台线程
				System.out.println("mydaemon:"+my.isDaemon());
				
				//获取线程是否中断
				System.out.println("myinterrupt:"+my.isInterrupted());
			}
		};
		t2.start();
	}

}
