package API_day05;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列:存储一组数据
 * 存取元素必须遵循先进先出原则
 * @author soft01
 *
 */
public class QueueDemo {
   public static void main(String[] args){
   //java.util.Queue
    	Queue<String> queue = new LinkedList<String>();
    	//入队方法 offer
    	queue.offer("a");
    	queue.offer("b");
    	queue.offer("c");
    	System.out.println(queue);
    	
    	
    	/**
    	 * 若我们仅仅希望引用队首元素，而不希望
    	 * 该元素出队，可以调用peek方法
    	 */
    	String str = queue.peek();
    	System.out.println(str);
    	System.out.println(queue);
    	
//    	// 出队方法
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
