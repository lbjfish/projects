package API_2day_04;
/**
 * 后台线程，守护线程
 * 特点：
 * 当进程中所有前台线程都结束时，后台线程结束，无论这个后台线程是否还在运行
 * 
 * main线程和rose线程都是前台线程，jack加setDaemon后是后台线程，
 * mian线程最先结束，然后rose线程，最后jack线程结束。只要前台线程
 * 结束，后台线程不管是否还在循环都强制结束，后台线程又称守护线程
 * @author soft01
 *
 */
public class ThreadDemo7 {
	public static void main(String[] args){
		//rose 扮演者：前台线程
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("rose:let me go");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} //一秒执行一次循环
				}
				System.out.println("rose:AAAAAAAAAAaaaaaaa");
				System.out.println("特效：扑通");
			}
		};
		
		//jack 扮演者：后台线程
		Thread jack = new Thread(){
			public void run(){
			   while(true){
					System.out.println("jack:you jump!,i jump!");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		//坏蛋 扮演者：后台线程
				Thread huaidan = new Thread(){
					public void run(){
					   while(true){
							System.out.println("跟我一起死！！！");
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				};
		rose.start();
		jack.setDaemon(true);
		jack.start();
		huaidan.setDaemon(true);
		huaidan.start();
		System.out.println("main方法结束了");
	}

}
