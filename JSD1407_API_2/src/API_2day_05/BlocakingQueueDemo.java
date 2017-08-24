package API_2day_05;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
//������
class Donwload implements Runnable {
    private final BlockingQueue<Object> queue;  //������
    public Donwload(BlockingQueue<Object> q) {
        queue = q;
    }
    
    int index=0;
    public Object produce() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "��Ƶ����"+index++;
    }
    
    public void run() {
        try {
            while (true) {
                System.out.println("������Ƶ����"+index);
                queue.put(produce());                
            }
        } catch (InterruptedException e) {
        }
    }
}

//������
class Player implements Runnable  {
    private final BlockingQueue<Object> queue;   //������
    public Player(BlockingQueue<Object> q) { 
        queue = q;
    }
    
    void consume(Object x) {
        System.out.println("����"+x);
    }
    
    public void run() {
        try {
            while (true) {
                consume(queue.take());
            }
        } catch (InterruptedException ex) {
        }
    }
}



public class BlocakingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Object> q = new ArrayBlockingQueue<Object>(10);
        Donwload p = new Donwload(q);
        Player c1 = new Player(q);
        Player c2 = new Player(q);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}