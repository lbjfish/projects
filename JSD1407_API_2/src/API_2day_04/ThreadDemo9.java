package API_2day_04;
/**
 * join可以使线程同步。如果等的线程阻塞了，join也能解除阻塞，继续执行
 * 后面的
 * 
 * 方法内定义的类叫局部内部匿名类，当局部内部类若想引用这个方法中的
 * 其他变量必须是final的
 * 
 * mian方法中定义了一个内部类show，该内部类中若想引用main方法中的
 * 其他局部变量，那么这个变量必须是final的
 * @author soft01
 *
 */
public class ThreadDemo9 {
	//表示图片是否下载完毕
	public static boolean isFinish;
	public static void main(String[] args){
		//下载线程
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片......");
				for(int i=1;i<=100;i++){
					System.out.println("down:已完成"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();  //一般都不显示异常
					}
				}
				System.out.println("down:图片下载完毕");
				isFinish = true;
			}
		};
		
		Thread show = new Thread(){
			public void run(){
				System.out.println("show:开始显示图片");
				//这里应当等待下载线程将图片下载完毕
				try {
					download.join();
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

}
