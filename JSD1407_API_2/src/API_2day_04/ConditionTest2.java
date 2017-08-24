package API_2day_04;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BoundedBuffer {
    final Lock lock = new ReentrantLock();
    final Condition notFull  = lock.newCondition(); 
    final Condition notEmpty = lock.newCondition(); 

    final Object[] objs = new Object[5];
    int putptr, takeptr, count;

    public void put(Object obj) throws InterruptedException {
        lock.lock();    //��ȡ��
        try {
            // �������������������ȴ���ֱ�������塱�������ģ��Ž�x��ӵ������С�
            while (count >= objs.length){
                notFull.await();
            }
            // ��objs��ӵ�������
            objs[putptr] = obj; 
            // ����putͳ����putptr+1�������������������������putptrΪ0��
            if (++putptr == objs.length){ 
            	putptr = 0;
            }
            // �������塱����+1
            ++count;
            // ����take�̣߳���Ϊtake�߳�ͨ��notEmpty.await()�ȴ�
            notEmpty.signal();

            // ��ӡд�������
            System.out.println(Thread.currentThread().getName() + " put  "+ (Integer)obj);
        } finally {
            lock.unlock();    // �ͷ���
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();    //��ȡ��
        try {
            // ���������Ϊ�ա�����ȴ���ֱ�������塱��Ϊ�գ��Ž�x�ӻ�����ȡ����
            while (count == 0) 
                notEmpty.await();
            // ��x�ӻ�����ȡ��
            Object obj = objs[takeptr]; 
            // ����takeͳ����takeptr+1�������������Ϊ�ա�������takeptrΪ0��
            if (++takeptr == objs.length) takeptr = 0;
            // �������塱����-1
            --count;
            // ����put�̣߳���Ϊput�߳�ͨ��notFull.await()�ȴ�
            notFull.signal();

            // ��ӡȡ��������
            System.out.println(Thread.currentThread().getName() + " take "+ (Integer)obj);
            return obj;
        } finally {
            lock.unlock();    // �ͷ���
        }
    } 
}

public class ConditionTest2 {
    private static BoundedBuffer bb = new BoundedBuffer();

    public static void main(String[] args) {
        // ����10����д�̡߳�����BoundedBuffer�в��ϵ�д����(д��0-9)��
        // ����10�������̡߳�����BoundedBuffer�в��ϵĶ����ݡ�
        for (int i=0; i<10; i++) {
            new PutThread("p"+i, i).start();
            new TakeThread("t"+i).start();
        }
    }

    static class PutThread extends Thread {
        private int num;
        public PutThread(String name, int num) {
            super(name);
            this.num = num;
        }
        public void run() {
            try {
                Thread.sleep(1);    // �߳�����1ms
                bb.put(num);        // ��BoundedBuffer��д������
            } catch (InterruptedException e) {
            }
        }
    }

    static class TakeThread extends Thread {
        public TakeThread(String name) {
            super(name);
        }
        public void run() {
            try {
                Thread.sleep(10);                    // �߳�����1ms
                Integer num = (Integer)bb.take();    // ��BoundedBuffer��ȡ������
            } catch (InterruptedException e) {
            }
        }
    }
}
