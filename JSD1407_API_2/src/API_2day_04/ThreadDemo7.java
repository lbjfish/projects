package API_2day_04;
/**
 * ��̨�̣߳��ػ��߳�
 * �ص㣺
 * ������������ǰ̨�̶߳�����ʱ����̨�߳̽��������������̨�߳��Ƿ�������
 * 
 * main�̺߳�rose�̶߳���ǰ̨�̣߳�jack��setDaemon���Ǻ�̨�̣߳�
 * mian�߳����Ƚ�����Ȼ��rose�̣߳����jack�߳̽�����ֻҪǰ̨�߳�
 * ��������̨�̲߳����Ƿ���ѭ����ǿ�ƽ�������̨�߳��ֳ��ػ��߳�
 * @author soft01
 *
 */
public class ThreadDemo7 {
	public static void main(String[] args){
		//rose �����ߣ�ǰ̨�߳�
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("rose:let me go");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} //һ��ִ��һ��ѭ��
				}
				System.out.println("rose:AAAAAAAAAAaaaaaaa");
				System.out.println("��Ч����ͨ");
			}
		};
		
		//jack �����ߣ���̨�߳�
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
		
		//���� �����ߣ���̨�߳�
				Thread huaidan = new Thread(){
					public void run(){
					   while(true){
							System.out.println("����һ����������");
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
		System.out.println("main����������");
	}

}
