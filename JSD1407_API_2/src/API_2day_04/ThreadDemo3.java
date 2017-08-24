package API_2day_04;
/**
 * 使用匿名内部类的形式创建线程
 * @author soft01
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args){
		//方法1
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("你是谁啊");
				}
			}
		};
		//方法2
//		Runnable run = new Runnable(){
//			public void run(){
//				for(int i=0;i<1000;i++){
//					System.out.println("我是查水表的");
//				}
//				
//			}
//		};
//		Thread t2 = new Thread(run);
		/**
		 * 简单写 以后就这样写
		 */
		Thread t2 = new Thread(
		new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("我是查水表的");
				}
			}
		}
		);

		t1.start();
		t2.start();
	}

}
