package API_2day_04;
/**
 * ʹ�������ڲ������ʽ�����߳�
 * @author soft01
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args){
		//����1
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭��");
				}
			}
		};
		//����2
//		Runnable run = new Runnable(){
//			public void run(){
//				for(int i=0;i<1000;i++){
//					System.out.println("���ǲ�ˮ���");
//				}
//				
//			}
//		};
//		Thread t2 = new Thread(run);
		/**
		 * ��д �Ժ������д
		 */
		Thread t2 = new Thread(
		new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("���ǲ�ˮ���");
				}
			}
		}
		);

		t1.start();
		t2.start();
	}

}
