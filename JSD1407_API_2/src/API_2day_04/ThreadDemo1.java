package API_2day_04;
/**
 * ��һ�ִ����̵߳ķ�ʽ
 *�̳�Thread�࣬��дrun����
 * @author soft01
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args){
	   Thread t1 = new MyThread1();
	   Thread t2 = new MyThread2();
		/**
		 * start�������ڽ��߳������̵߳���
		 * ��ʱ���߳̽���runnable���ȴ���״̬���ȴ�
		 * �̵߳��ȷ���ʱ��Ƭ�Ρ�
		 * ���̵߳��Ƚ�ʱ��Ƭ�������ǰ�߳�
		 * ���̵߳�run�����ſ�ʼ��ִ�С�
		 * ֱ���̵߳�run����ִ����ϣ��߳̽���
		 * ���ձ����ա�
		 * ���̵߳�run����ִ���ڼ䣬���̴߳�������ͣͣ��
		 */
	   
		t1.start();
		t2.start();	
		System.out.println("--------------");
		
	}
}
/**
 * ���� ��� spring
 * @author soft01
 *
 */
class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭��");
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("�Ҳ�ˮ���");
		}
	}
}