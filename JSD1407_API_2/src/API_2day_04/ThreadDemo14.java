package API_2day_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadDemo14 {
	/*
	 * �����̳߳صĴ�С ĿǰΪ5 ����˵�̳߳���5���̣߳����ֻ��Ҫ4���߳� ��for i=0;i<4��ʣ��һ���߳����̳߳�����ã������ò�����
	 * �����Ҫ6���߳̾� for i=0;i<6����Ϊ�̳߳���ֻ��5���̣߳�����ִ��һ���̳߳غ󣬻�Ҫ��ִ��һ���̳߳أ�ֻ����
	 * �ڶ���ִ���̳߳���ֻ��Ҫһ���̣߳�ʣ��4������ ��
	 */
	 public final static int THREAD_POOL_SIZE = 5;
	 
	    public static Map<String, Integer> crunchifyHashTableObject = null;
	    public static Map<String, Integer> crunchifySynchronizedMapObject = null;
	    public static Map<String, Integer> crunchifyConcurrentHashMapObject = null;
	 
	    public static void main(String[] args) throws InterruptedException {
	 
	        // Test with Hashtable Object
	        crunchifyHashTableObject = new Hashtable<>();
	        crunchifyPerformTest(crunchifyHashTableObject);
	 
	        // Test with synchronizedMap Object
	        crunchifySynchronizedMapObject = Collections.synchronizedMap(new HashMap<String, Integer>());
	        crunchifyPerformTest(crunchifySynchronizedMapObject);
	 
	        // Test with ConcurrentHashMap Object
	        crunchifyConcurrentHashMapObject = new ConcurrentHashMap<>();
	        crunchifyPerformTest(crunchifyConcurrentHashMapObject);
	        
	 
	    }
	 
	    public static void crunchifyPerformTest(final Map<String, Integer> crunchifyThreads) throws InterruptedException {
	    	List<String> list = new ArrayList<String>();
	    	
	    	list.stream();
	        System.out.println("Test started for: " + crunchifyThreads.getClass());
	        long averageTime = 0;
	        //���for��Ϊ�˸�ִ��3���̳߳�(��������̳߳ز����߳�)
	        for (int i = 0; i < 3; i++) {
	 
	            long startTime = System.nanoTime();
	            ExecutorService crunchifyExServer = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
	            /*
	             * �̳߳�����5���߳� ���for�� �պ�һ��ִ����5���߳�
	             *	�����j<4�Ļ�����֮��5С���У��̳߳��������5���߳�Ҳִ��4�Σ���Ϊֻ��Ҫ4���̣߳�
	             *	�����j<6�Ļ�����֮��5����У��̳߳���ֻ��5���̣߳���˵��һ��ֻ�ܴ���5���߳�
	             *		����Ҫ�������β��У���һ�δ���5���̣߳��ڶ��δ���1���̣߳� 
	             */
	            for (int j = 0; j < THREAD_POOL_SIZE; j++) {
	                crunchifyExServer.execute(new Runnable() {
	                    @SuppressWarnings("unused")
	                    @Override
	                    public void run() {
	                    	//���for��ÿ���̣߳�ע�⣺�����̳߳��� �����ˣ����̳߳���ÿ���̣߳�ִ��50��β���
	                        for (int i = 0; i < 500000; i++) {
	                            Integer crunchifyRandomNumber = (int) Math.ceil(Math.random() * 550000);
	 
	                            // Retrieve value. We are not using it anywhere
	                            Integer crunchifyValue = crunchifyThreads.get(String.valueOf(crunchifyRandomNumber));
	 
	                            // Put value
	                            crunchifyThreads.put(String.valueOf(crunchifyRandomNumber), crunchifyRandomNumber);
	                        }
	                    }
	                });
	            }
	 
	            // Make sure executor stops
	            crunchifyExServer.shutdown();
	 
	            // Blocks until all tasks have completed execution after a shutdown request
	            crunchifyExServer.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
	 
	            long entTime = System.nanoTime();
	            long totalTime = (entTime - startTime) / 1000000L;
	            averageTime += totalTime;
	            System.out.println("2500K entried added/retrieved in " + totalTime + " ms");
	        }
	        System.out.println("For " + crunchifyThreads.getClass() + " the average time is " + averageTime / 3 + " ms\n");
	    }
}
