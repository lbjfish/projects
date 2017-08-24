package API_2day_04;
/**
 * �߳�Эͬ����
 * 
 * �ҵ����µĶԴ˳���Ľ��ͣ�
 * 		�������߳�startʱ��˭��ִ�е�˳���ǲ�һ���ģ�����һ�㣨��ֻ��˵һ����ѣ����������£���
 * 		˭�ȵ���start()��˭�����ȼ��ߣ�������ִ���ĸ��̵߳�run()����Ȼ˳���ǹ̶���������ģ���
 * 		ֱ��ĳ���߳��е�����wait()��wait��Ҫ��ͬ���������Ĳ�������Ҫ�õ����Ǹ��̵߳Ķ��󣩣�
 * 		���߳�wait()��ִ�е������ӡ�����ݣ��ͱ������ˣ���������߳�wait()��Ķ�����ʱ��ִ���ˣ���
 * 		ֱ�����õ������Ǹ��̵߳�����notify()��notyfy()Ҫ��ͬ���������Ĳ����Ǳ��̣߳�һ����this����
 * 		��notify()��ִ�е������ӡ������ִ���꣬��ִ�������Ǹ��߳�wait()����Ķ�����
 * 		���˳���Ǿ��Եģ���Ϊ�϶�����ִ��notify()���ִ��wait()��Ķ�������
 * 		�����и����������notify()�����Thread.sleep(1000)�߳�����������ִ��wait()��Ķ�����ִ��
 * 		notify()��Ķ���
 * 		
 * @author ��� 20170627
 */
public class ThreadDemo10 {

	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish;
	public static Object obj = new Object();
	
	public static void main(String[] args) {
	//�����߳�
			final Thread download = new Thread(){
				public void run(){
					System.out.println("down:��ʼ����ͼƬ......");
					for(int i=1;i<=100;i++){
						System.out.println("down:�����"+i+"%");
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							//e.printStackTrace();  //һ�㶼����ʾ�쳣
						}
					}
					System.out.println("down:ͼƬ�������");
					
					isFinish = true;
					
					/**
					 * ��ͼƬ������ϣ���Ӧ��֪ͨ��ʾͼƬ���߳̿�ʼ������
					 */
					synchronized(this){
						this.notify();
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("down22222:�����������");
				}
			};
			
			Thread show = new Thread(){
				public void run(){
					System.out.println("show:��ʼ��ʾͼƬ");
					System.out.println("��ʾͼƬ222222");
					//����Ӧ���ȴ������߳̽�ͼƬ�������
					try {
						//download.join();
						//��obj�����ϵȴ�
						synchronized(download){
							download.wait();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(!isFinish){
						throw new RuntimeException("ͼƬû���ҵ�");
					}
					System.out.println("show����ʾͼƬ���....");
				}
			};
			download.start();
			show.start();
	}
	
//	public static void main(String[] args){
//		//�����߳�
//		final Thread download = new Thread(){
//			public void run(){
//				System.out.println("down:��ʼ����ͼƬ......");
//				for(int i=1;i<=100;i++){
//					System.out.println("down:�����"+i+"%");
//					try {
//						Thread.sleep(5);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						//e.printStackTrace();  //һ�㶼����ʾ�쳣
//					}
//				}
//				System.out.println("down:ͼƬ�������");
//				
//				isFinish = true;
//				
//				/**
//				 * ��ͼƬ������ϣ���Ӧ��֪ͨ��ʾͼƬ���߳̿�ʼ������
//				 */
//				synchronized(obj){
//					obj.notify();
//				}
//				
//				System.out.println("down22222:�����������");
//			}
//		};
//		
//		Thread show = new Thread(){
//			public void run(){
//				System.out.println("show:��ʼ��ʾͼƬ");
//				System.out.println("��ʾͼƬ222222");
//				//����Ӧ���ȴ������߳̽�ͼƬ�������
//				try {
//					//download.join();
//					//��obj�����ϵȴ�����ʵ�õ�����download�̵߳�����
//					synchronized(obj){
//						obj.wait();
//					}
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				if(!isFinish){
//					throw new RuntimeException("ͼƬû���ҵ�");
//				}
//				System.out.println("show����ʾͼƬ���....");
//			}
//		};
//		download.start();
//		show.start();
//	}
}
