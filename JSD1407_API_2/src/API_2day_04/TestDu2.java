package API_2day_04;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class TestDu2 extends Thread { 
	  static Vector<Integer> list = new Vector<Integer>(100);
      static CountDownLatch count = new CountDownLatch(10);
 
      @Override
     public void run() {
 
          while (list.size() > 0) {
                try {
                     int val = list.remove(0);
                     System.out.println(val);
                     Thread.sleep(100);//ģ�⴦��
                } catch (Exception e) {
                     // ��������Խ�磬����ط�ֻ��Ϊ��˵�����⣬���Դ���
                }
 
          }
          
           count.countDown(); // ɾ���ɹ���һ
 
     }
 
     public static void main(String[] args) throws InterruptedException {
          
           for (int i = 0; i < 100; i++) {
                list.add(i);
           }
          
           long start = System.currentTimeMillis();
           //�ֱ�����ʮ���߳�
          for (int i = 0; i < 10; i++) {
                new TestDu2().start();
           }
 
         
       //�ȴ���������ֵ��Ϊ��  Ҳ���ǵȴ�ʮ���̶߳�ִ�������Ժ�ż�������ִ��
          count.await();
           long end = System.currentTimeMillis();
           System.out.println("���� " + (end - start) + " ms");
 
     }
}

