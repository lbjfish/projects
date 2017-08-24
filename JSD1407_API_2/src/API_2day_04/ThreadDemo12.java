package API_2day_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 本例子 三个类都放这了
 * @author Administrator
 *
 */
public class ThreadDemo12 {
    public static ConcurrentHashMap<Integer, String> pushmessage = new ConcurrentHashMap<Integer,String>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            pushmessage.put(i, "该消息是id为"+i+"的消息");
        }
        Thread pushThread=new PushThread();
        Thread remove=new RemoveThread();
        
        pushThread.start();
        remove.start();
        
        for (int i = 10; i < 20; i++) {
            pushmessage.put(i, "又一波到来，消息是id为"+i+"的消息");
        }
    }
}

class PushThread extends Thread {
	 @Override
	    public void run() {
	        // TODO Auto-generated method stub
	        try {
	            sleep(6000);
	            while(ThreadDemo12.pushmessage.size()>0){
	                //重发消息
	                for(Entry<Integer, String> hashMap:ThreadDemo12.pushmessage.entrySet()){
	                    System.out.println("消息id:"+hashMap.getKey()+"未发送成功，在此重发:"+hashMap.getValue());
	                }
	                sleep(1000);
	            }
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}

class RemoveThread extends Thread {
	@Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            for (int i = 0; i < 10000; i++) {
                sleep(2000);
                for(Entry<Integer, String> map:ThreadDemo12.pushmessage.entrySet()){
                    if (map.getKey()==i) {
                        System.out.println("成功收到id为："+map.getKey()+"返回的信息，删除该元素");
                        ThreadDemo12.pushmessage.remove(map.getKey());
                    }
                }
                System.out.println("内存对象中的元素数量为："+ThreadDemo12.pushmessage.size());
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
