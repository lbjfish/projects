package API_2day_04;
/**
 * 线程协同工作
 * 
 * 我的最新的对此程序的解释：
 * 		当两个线程start时，谁先执行的顺序是不一样的，但是一般（我只是说一般而已，大多数情况下），
 * 		谁先调用start()，谁的优先级高（就是先执行哪个线程的run()，当然顺序不是固定的是随机的），
 * 		直到某个线程中调用了wait()后（wait上要加同步锁，锁的参数是你要拿到的那个线程的对象），
 * 		此线程wait()后执行的语句或打印的数据，就被阻塞了（就是这个线程wait()后的东西暂时不执行了），
 * 		直到你拿到锁的那个线程调用了notify()后（notyfy()要加同步锁，锁的参数是本线程，一般是this），
 * 		把notify()后执行的语句或打印的数据执行完，才执行上面那个线程wait()后面的东西，
 * 		这个顺序是绝对的（因为肯定是先执行notify()后才执行wait()后的东西），
 * 		但是有个特例，如果notify()后加了Thread.sleep(1000)线程阻塞，会先执行wait()后的东西再执行
 * 		notify()后的东西
 * 		
 * @author 李保军 20170627
 */
public class ThreadDemo10 {

	//表示图片是否下载完毕
	public static boolean isFinish;
	public static Object obj = new Object();
	
	public static void main(String[] args) {
	//下载线程
			final Thread download = new Thread(){
				public void run(){
					System.out.println("down:开始下载图片......");
					for(int i=1;i<=100;i++){
						System.out.println("down:已完成"+i+"%");
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();  //一般都不显示异常
						}
					}
					System.out.println("down:图片下载完毕");
					
					isFinish = true;
					
					/**
					 * 当图片下载完毕，就应当通知显示图片的线程开始工作了
					 */
					synchronized(this){
						this.notify();
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("down22222:附件下载完毕");
				}
			};
			
			Thread show = new Thread(){
				public void run(){
					System.out.println("show:开始显示图片");
					System.out.println("显示图片222222");
					//这里应当等待下载线程将图片下载完毕
					try {
						//download.join();
						//在obj对象上等待
						synchronized(download){
							download.wait();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(!isFinish){
						throw new RuntimeException("图片没有找到");
					}
					System.out.println("show：显示图片完毕....");
				}
			};
			download.start();
			show.start();
	}
	
//	public static void main(String[] args){
//		//下载线程
//		final Thread download = new Thread(){
//			public void run(){
//				System.out.println("down:开始下载图片......");
//				for(int i=1;i<=100;i++){
//					System.out.println("down:已完成"+i+"%");
//					try {
//						Thread.sleep(5);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						//e.printStackTrace();  //一般都不显示异常
//					}
//				}
//				System.out.println("down:图片下载完毕");
//				
//				isFinish = true;
//				
//				/**
//				 * 当图片下载完毕，就应当通知显示图片的线程开始工作了
//				 */
//				synchronized(obj){
//					obj.notify();
//				}
//				
//				System.out.println("down22222:附件下载完毕");
//			}
//		};
//		
//		Thread show = new Thread(){
//			public void run(){
//				System.out.println("show:开始显示图片");
//				System.out.println("显示图片222222");
//				//这里应当等待下载线程将图片下载完毕
//				try {
//					//download.join();
//					//在obj对象上等待（其实拿到的是download线程的锁）
//					synchronized(obj){
//						obj.wait();
//					}
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				if(!isFinish){
//					throw new RuntimeException("图片没有找到");
//				}
//				System.out.println("show：显示图片完毕....");
//			}
//		};
//		download.start();
//		show.start();
//	}
}
