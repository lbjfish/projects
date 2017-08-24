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
                     Thread.sleep(100);//模拟处理
                } catch (Exception e) {
                     // 可能数组越界，这个地方只是为了说明问题，忽略错误
                }
 
          }
          
           count.countDown(); // 删除成功减一
 
     }
 
     public static void main(String[] args) throws InterruptedException {
          
           for (int i = 0; i < 100; i++) {
                list.add(i);
           }
          
           long start = System.currentTimeMillis();
           //分别启动十个线程
          for (int i = 0; i < 10; i++) {
                new TestDu2().start();
           }
 
         
       //等待计数器的值减为零  也就是等待十个线程都执行完了以后才继续往下执行
          count.await();
           long end = System.currentTimeMillis();
           System.out.println("消耗 " + (end - start) + " ms");
 
     }
}

