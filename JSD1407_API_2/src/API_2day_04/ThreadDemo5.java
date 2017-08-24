package API_2day_04;
/**
 * �߳�����API
 * @author soft01
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args){
		//��ȡ����main�������̵߳������Ϣ
		Thread t = Thread.currentThread();
		System.out.println("����main�������߳��ǣ�"+t);
		
		//��ȡ�߳�ID��ͨ����ϵͳ����
		long id = t.getId();
		System.out.println("id:"+id);
		
		/**
		 * ��ȡ�߳����֣�ͨ����ϵͳָ��
		 * ��ʽΪ��Thread-X
		 * ������mian�������߳����ֲ��������
		 */
		
		String name = t.getName();
		System.out.println("name:"+name);
		
		//��ȡ�̵߳����ȼ�
		int p = t.getPriority();
		System.out.println("���ȼ���"+p);
		
		//��ȡ�߳�״̬
		System.out.println("state:"+t.getStackTrace());
		
		//��ȡ�߳��Ƿ����
		System.out.println("alive:"+t.isAlive());
		
		//��ȡ�߳��Ƿ�Ϊ��̨�߳�
		System.out.println("daemon:"+t.isDaemon());
		
		//��ȡ�߳��Ƿ��ж�
		System.out.println("interrupt:"+t.isInterrupted());
		
		Thread t2 = new Thread(){
			public void run(){
				Thread my = Thread.currentThread();
				System.out.println("�Լ�������:"+my);
				long id2 = my.getId();
				System.out.println("�Լ���id:"+id2);
				
				System.out.println("Myname2:"+my.getName());
				System.out.println("Myname3:"+getName());
				
				//��ȡ�̵߳����ȼ�
				int p = my.getPriority();
				System.out.println("my���ȼ���"+p);
				
				//��ȡ�߳�״̬
				System.out.println("mystate:"+my.getStackTrace());
				
				//��ȡ�߳��Ƿ����
				System.out.println("myalive:"+my.isAlive());
				
				//��ȡ�߳��Ƿ�Ϊ��̨�߳�
				System.out.println("mydaemon:"+my.isDaemon());
				
				//��ȡ�߳��Ƿ��ж�
				System.out.println("myinterrupt:"+my.isInterrupted());
			}
		};
		t2.start();
	}

}
