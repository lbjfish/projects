package API_day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ����:�洢һ������
 * ��ȡԪ�ر�����ѭ�Ƚ��ȳ�ԭ��
 * @author soft01
 *
 */
public class QueueDemo {
   public static void main(String[] args){
   //java.util.Queue
    	Queue<String> queue = new LinkedList<String>();
    	//��ӷ��� offer
    	queue.offer("a");
    	queue.offer("b");
    	queue.offer("c");
    	System.out.println(queue);
    	
    	
    	/**
    	 * �����ǽ���ϣ�����ö���Ԫ�أ�����ϣ��
    	 * ��Ԫ�س��ӣ����Ե���peek����
    	 */
    	String str = queue.peek();
    	System.out.println(str);
    	System.out.println(queue);
    	
//    	// ���ӷ���
//    	String str = queue.poll();
//    	System.out.println(str);
//    	System.out.println(queue);
    	
    	while(queue.size()>0){
    		String s = queue.poll();
    		System.out.println(s);
    	}
    	System.out.println(queue);
    }

}
