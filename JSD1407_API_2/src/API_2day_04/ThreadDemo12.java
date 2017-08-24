package API_2day_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ������ �����඼������
 * @author Administrator
 *
 */
public class ThreadDemo12 {
    public static ConcurrentHashMap<Integer, String> pushmessage = new ConcurrentHashMap<Integer,String>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            pushmessage.put(i, "����Ϣ��idΪ"+i+"����Ϣ");
        }
        Thread pushThread=new PushThread();
        Thread remove=new RemoveThread();
        
        pushThread.start();
        remove.start();
        
        for (int i = 10; i < 20; i++) {
            pushmessage.put(i, "��һ����������Ϣ��idΪ"+i+"����Ϣ");
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
	                //�ط���Ϣ
	                for(Entry<Integer, String> hashMap:ThreadDemo12.pushmessage.entrySet()){
	                    System.out.println("��Ϣid:"+hashMap.getKey()+"δ���ͳɹ����ڴ��ط�:"+hashMap.getValue());
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
                        System.out.println("�ɹ��յ�idΪ��"+map.getKey()+"���ص���Ϣ��ɾ����Ԫ��");
                        ThreadDemo12.pushmessage.remove(map.getKey());
                    }
                }
                System.out.println("�ڴ�����е�Ԫ������Ϊ��"+ThreadDemo12.pushmessage.size());
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
