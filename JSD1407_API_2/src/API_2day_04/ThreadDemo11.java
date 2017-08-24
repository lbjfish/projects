package API_2day_04;

public class ThreadDemo11 {
	private static int total; 
	
	public static void main(String[] args) {
		Thread b = new Thread(){
			public void run(){
				synchronized (this) {
		            for (int i = 0; i < 101; i++) {
		                total += i; 
		            } 
		            System.out.println("�������");
		            //����ɼ����ˣ������ڴ˶���������ϵȴ��ĵ����̣߳��ڱ������߳�A������
		            notify(); 
		            
		        } 
			}
		};
		Thread a = new Thread(){
			public void run(){
				//�õ�����b���������������b�̵߳���,��Ȼ����һ�� ��߿϶�Ҫ�����Ժ�,�������ý���
				synchronized (b) {
		            System.out.println("�ȴ�����b��ɼ��㡣����");
		            //��ǰ�߳�A�ȴ�
		            try {
						b.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		            System.out.println("b���������ܺ��ǣ�" + total);
		        } 
			}
		};
		
		a.start();
		b.start();
		
	}
}
